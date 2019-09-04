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

import com.cgi.hubtoswitch.dao.MaterielDAO;
import com.cgi.hubtoswitch.dto.Materiel;

@Path("/materiel")
public class MaterielController {
	
	MaterielDAO materielDao = new MaterielDAO();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List get() {
		List listOfMateriel=materielDao.getAll();
		return listOfMateriel;	
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Materiel getMateriel(@PathParam("id") int id) {
		return materielDao.getById(id);
	}

	@POST
	@Path("/new")
	@Consumes({MediaType.APPLICATION_JSON})
	public void newMateriel() {
		materielDao.addMateriel();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	public void editMateriel(@PathParam("id")int id) {
		materielDao.updateMateriel(id);;
	}
	
	@DELETE
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public void deleteMateriel(@PathParam("id")int id) {
		materielDao.deleteMaterielById(id);
	}
}
