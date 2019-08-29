package com.cgi.hubtoswitch.dao;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cgi.hubtoswitch.dto.Client;

@Path("/client")
public class ClientDAO {
		
	@GET
	@Path("/{nom}")
	@Produces({MediaType.APPLICATION_JSON})
	public Client get() { 
		//TODO 
		return null;
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Client createOrUpdate(Client client) {
		//TODO
		return  null;
	}
	
	@DELETE
	public void delete() {}
}
