package com.cgi.hubtoswitch.dao;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public class ClientDAO {

	@GET
	@Path("/{nom}")
	@Produces({MediaType.APPLICATION_JSON})
	public Client get() {}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Client createOrUpdate(Client client) {
		
	}
	
	@DELETE
	public void delete() {}
}
