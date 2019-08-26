package com.cgi.hubtoswitch.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
* Un singleton pour récupérer une connexion à une base de données.
* Exemple d'utilisation :
*
* Connection c = ResoDataSource.getSingleton().getConnection();
*
*/
public class ResoDataSource {

	private static final String DATASOURCE_NAME = "bdd/hts";
	private static ResoDataSource singleton = new ResoDataSource();

	public static ResoDataSource getSingleton() {
		return singleton;
	}

	private DataSource dataSource;

	private ResoDataSource() {
		try {
			Context envContext = InitialContext.doLookup("java:/comp/env");
			dataSource = (DataSource) envContext.lookup(DATASOURCE_NAME);
		} catch (NamingException e) {
			throw new RuntimeException(e);
		}
	}

	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

}
