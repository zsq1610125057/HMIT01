package com.dao.imp;

import java.sql.SQLException;

import com.dao.EmployeesDao;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.vos.Employees;

public class EmployeesDaoImp implements EmployeesDao {
	private SqlMapClient sqlMapClient;

	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public Employees queryById(Employees employees) throws SQLException {
		// TODO Auto-generated method stub
		return (Employees) sqlMapClient.queryForObject("queryById", employees);
	}

}
