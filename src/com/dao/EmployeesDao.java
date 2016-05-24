package com.dao;

import java.sql.SQLException;

import com.vos.Employees;

public interface EmployeesDao {
	public Employees queryById(Employees employees) throws SQLException;
}
