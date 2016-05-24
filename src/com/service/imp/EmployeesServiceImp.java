package com.service.imp;

import java.sql.SQLException;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.dao.EmployeesDao;
import com.service.EmployeesService;
import com.vos.Employees;


@Service("employeesService")
public class EmployeesServiceImp implements EmployeesService{
	@Resource(name = "employeesDao")
	private EmployeesDao employeesDao;	
	public EmployeesDao getEmployeesDao() {
		return employeesDao;
	}
	public void setEmployeesDao(EmployeesDao employeesDao) {
		this.employeesDao = employeesDao;
	}
	public Employees queryById(Employees employees) throws SQLException{
		return employeesDao.queryById(employees) ;
	}
}
