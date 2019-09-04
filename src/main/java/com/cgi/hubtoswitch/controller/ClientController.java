package com.cgi.hubtoswitch.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cgi.hubtoswitch.dao.ClientDAO;
import com.cgi.hubtoswitch.dto.Client;

@Path("/client")
public class ClientController {
	
	ClientDAO clientDao = new ClientDAO();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List get() {
		List listOfClient=clientDao.getAll();
		return listOfClient;	
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Client getClient(@PathParam("id") int id) {
		return clientDao.getById(id);
	}
	
	@POST
	@Path("/new")
	@Consumes({MediaType.APPLICATION_JSON})
	public void newMateriel() {
		clientDao.addClient();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	public void editMateriel(@PathParam("id")int id) {
		clientDao.updateClient(id);;
	}
	
	@DELETE
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public void deleteMateriel(@PathParam("id")int id) {
		clientDao.deleteClientById(id);
	}

}
