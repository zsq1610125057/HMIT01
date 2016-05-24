package com.service;

import java.sql.SQLException;

import com.vos.Employees;

public interface EmployeesService {
	public Employees queryById(Employees employees) throws SQLException;
}
