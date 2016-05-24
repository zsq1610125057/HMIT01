package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.service.EmployeesService;
import com.util.HmitUtil;
import com.vos.Employees;

@Controller
@SessionAttributes
public class EmployeesController {
	public  static final String LOGIN_SUCCESS_MSG = "登录成功";
	public  static final String LOGIN_FAILED_MSG = "用户名或密码错误";
	@Resource(name = "employeesService")
	private EmployeesService employeesService;
	public EmployeesService getEmployeesService() {
		return employeesService;
	}
	public void setEmployeesService(EmployeesService employeesService) {
		this.employeesService = employeesService;
	}
	@RequestMapping("/queryById")
	@ResponseBody
	public void queryById(@RequestParam("loginName") String LoginName,@RequestParam("password") String password,HttpServletRequest request, HttpServletResponse response) throws IOException {
		Employees employees = new Employees();
		employees.setLoginName(LoginName);
		employees.setPassword(password);
		PrintWriter pw = response.getWriter();
		
		String incode = (String)request.getParameter("code");   
	    String rightcode = (String)request.getSession().getAttribute("rCode");  
	    
		try {
			Employees employees1 = employeesService.queryById(employees);
			if(employees1!=null&&(incode.equals(rightcode))){			
				request.getSession().setAttribute("user", employees.getLoginName());
				HmitUtil.CURRENT_USER = LoginName;
				HmitUtil.CURRENT_PASSWORD=password;
				pw.print("{\"result\":" + true + ",\"msg\":\"" + LOGIN_SUCCESS_MSG + "\"}");
			} else {
				pw.print("{\"result\":" + false + ",\"msg\":\"" + LOGIN_FAILED_MSG + "\"}");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pw.flush();
			pw.close();
		}
	}
}
