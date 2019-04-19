package com.main.service.impl;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.collections4.MapUtils;

import com.main.dao.impl.EmployeeDaoImpl;
import com.main.model.Employee;
import com.main.service.EmployeeService;

@Path("/employee")
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDaoImpl e = new EmployeeDaoImpl();
	
	@POST
    @Path("/create")
	@Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
	public Integer createEmployee(Map<String, Object> data) {
		// TODO Auto-generated method stub
		String name = MapUtils.getString(data, "name", null);
		int age = MapUtils.getInteger(data, "age", 0);
		return e.insertEmployee(new Employee(name, age));
	}

	@GET
    @Path("/employees")
	@Produces("application/json")
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employeeslist =  e.retrieveAllEmployess();
		for(int i=0;i< employeeslist.size();i++) {
		    System.out.println(employeeslist.get(i).toString());
		}
		return e.retrieveAllEmployess();
	}

	@GET
    @Path("/{id}")
	@Produces("application/json")
	public Employee getEmployeeById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return e.retrieveEmployeeById(id);
	}

}
