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
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cgi.hubtoswitch.dto.Client;

public class ClientDAO {
	
	//TODO REQUETES + METHODES VIDES
	private static String GET_CLIENT= "SELECT client.id, client.nom, client.adresse1, client.adresse2 FROM client";
	
	public List<Client> getAll() {
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
				List<Client> clients = new ArrayList<Client>();
				try(ResultSet rs = stmt.executeQuery(GET_CLIENT)){
					while(rs.next()) {
						Client clt = new Client(rs.getInt("id"),rs.getString("nom"), rs.getString("adresse1"),rs.getString("adresse2"));
						clients.add(clt);
					}
				}
				return clients;
			}catch(SQLException e) {
				throw new RuntimeException(e);
			}
	}
	
	public Client getById(@PathParam("id") int id) { 
		try(Connection connection = ResoDataSource.getSingleton().getConnection();
			Statement stmt = connection.createStatement()){
			try(ResultSet rs = stmt.executeQuery(GET_CLIENT + " WHERE materiel.id = "+ id)){
				if(rs.next()) {
					Client clt = new Client(rs.getInt("id"), rs.getString("nom"),rs.getString("adresse1"),rs.getString("adresse2"));
					return clt;
				}
				throw new NotFoundException();
			}
		}catch (SQLException e){
				throw new RuntimeException(e);
			}
	}
	
	public void addClient() {}
	
	public void updateClient(@PathParam("id") int id) {}

	public void deleteClientById(@PathParam("id") int id) {}
}
