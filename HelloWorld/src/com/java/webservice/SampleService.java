package com.java.webservice;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sample") 
public class SampleService {
	@GET 
	@Produces( MediaType.APPLICATION_JSON )
	@Path("/ss") 
	public String getUsers(){ 
		return "Anu";
	}
	
	@GET 
	@Produces( MediaType.APPLICATION_JSON )
	@Path("/a") 
	public Map<String, String> getA(){ 
		Map<String, String> f = new HashMap<String, String>();
		f.put("Name", "Anu");
		return f;
	} 
}
