package com.main.dao;

import java.util.List;
import java.util.Map;

import com.main.model.Employee;

public interface EmployeeDao {
	
	Integer insertEmployee(Employee e);

	List<Employee> retrieveAllEmployess();
	
	Employee retrieveEmployeeById(Integer id);
}
