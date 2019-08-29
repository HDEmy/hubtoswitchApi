package com.cgi.hubtoswitch.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cgi.hubtoswitch.dto.Client;
import com.cgi.hubtoswitch.dto.Materiel;
import com.cgi.hubtoswitch.dto.TypeMateriel;

@Path("/materiel")
public class MaterielDAO {

	
	private static String GET_MATERIEL = "SELECT materiel.id, materiel.libelle, materiel.numserie FROM materiel left outer join interface on materiel.idtype=interface.idtype left outer join typeif on typeif.id=interface.idtype";
//	private static String CREATE_MATERIEL = "INSERT INTO materiel(id, libelle, numserie, idclient, idtype) VALUES";
	private static String CREATE_MATERIEL = "INSERT INTO materiel(id, libelle, numserie, idclient, idtype) VALUES (13, 'Dell 1234', '011201252012', 3, 5)";
//	private static String UPDATE_MATERIEL = "UPDATE materiel SET";
	private static String UPDATE_MATERIEL= "UPDATE materiel SET materiel.id = 14, materiel.libelle = 'Mac 77777', materiel.numserie='666666', materiel.idclient=3, materiel.idtype=5 where id=13";
//	private static String DELETE_MATERIEL = "DELETE FROM materiel";
	private static String DELETE_MATERIEL = " DELETE FROM materiel WHERE materiel.id = 14" ;

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Materiel> getAll() {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
				List<Materiel> materiels = new ArrayList<Materiel>();
				try(ResultSet rs = stmt.executeQuery(GET_MATERIEL)){
					while(rs.next()) {
						Materiel m = new Materiel(rs.getInt("id"),rs.getString("libelle"), rs.getString("numserie"));
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
	public Materiel getById(@PathParam("id") int id) {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
				try(ResultSet rs = stmt.executeQuery(GET_MATERIEL + " WHERE materiel.id = "+ id)){
					if(rs.next()) {
						Materiel m = new Materiel(rs.getInt("id"), rs.getString("libelle"),rs.getString("numserie"));
						return m;
					}
					throw new NotFoundException();
				}
			}catch (SQLException e){
					throw new RuntimeException(e);
				}
	}
	
	@POST
	@Path("/new")
	@Consumes({MediaType.APPLICATION_JSON})
//	public void addMateriel(Materiel id, Materiel libelle, Materiel numserie, Client idclient, TypeMateriel idtype) {
	public void addMateriel() {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
//				stmt.executeUpdate(CREATE_MATERIEL + "("+ id + "," + libelle + "," + numserie + ","+ id + ","+ id +")" );
				stmt.executeUpdate(CREATE_MATERIEL);
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
//	public void updateMateriel(Materiel id, Materiel libelle, Materiel numserie, Client idclient, TypeMateriel idtype) {
	public void updateMateriel(@PathParam("id") int id) {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
			Statement stmt = connection.createStatement()){
//			stmt.executeUpdate(UPDATE_MATERIEL + "("+ id + "," + libelle + "," + numserie + ","+ id + ","+ id +")" );
			stmt.executeUpdate(UPDATE_MATERIEL);
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
		
	@DELETE
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public void deleteMaterielById(@PathParam("id") int id) {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
//				stmt.executeUpdate(DELETE_MATERIEL + "WHERE materiel.id=" + id);
				stmt.executeUpdate(DELETE_MATERIEL);
		}catch (SQLException e){
			throw new RuntimeException(e);
		}	
	}
		
}

