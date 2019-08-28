package com.cgi.hubtoswitch.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/materiel")
public class MaterielDAO {
	
	private static String GET_MATERIEL = "SELECT id, libelle FROM materiel";
	private static String DELETE_MATERIEL = "DELETE FROM materiel";
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Materiel getAll() {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
				List<Materiel> materiels = new ArrayList<Materiel>();
				try(ResultSet rs = stmt.executeQuery(GET_MATERIEL)){
					while(rs.next()) {
						Materiel m = new Materiel(rs.getInt("id"),rs.getString("libelle"));
						materiels.add(m);
					}
				}
				return materiels;
			}catch(SQLException e) {
				throw new RuntimeException(e);
			}
	}
		
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Materiel getById(int id) {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
				try(ResultSet rs = stmt.executeQuery(GET_MATERIEL + " WHERE id = "+ id)){
					if(rs.next()) {
						Materiel m = new Materiel(rs.getInt("id"), rs.getString("libelle"));
						return m;
					}
				}
			}catch (SQLException e){
					throw new RuntimeException(e);
				}
	}
	
	@PUT
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	public Materiel addMateriel() {
		
	}
	
	@DELETE
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public void deleteMaterielById(int id) {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
				try(ResultSet rs = stmt.executeQuery(DELETE_MATERIEL + "WHERE id =" + id)){	
				}
		}catch (SQLException e){
			throw new RuntimeException(e);
		}	
	}
		
}

