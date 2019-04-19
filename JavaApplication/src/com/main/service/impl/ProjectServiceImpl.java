package com.main.service.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.main.dao.impl.ProjectDaoImpl;
import com.main.model.Project;

@Path("/project")
public class ProjectServiceImpl {
	ProjectDaoImpl p = new ProjectDaoImpl();
	
	@GET
    @Path("/{id}")
	@Produces("application/json")
	public Project getProjectById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return p.retrieveProjectById(id);
	}
	
}
