package com.main.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import com.main.model.Employee;

public interface EmployeeService {
	
	Integer createEmployee(Map<String,Object> data);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Integer id);
}
