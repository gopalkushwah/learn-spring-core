package com.springcore.PropertiesCollection;

import java.util.Properties;

public class PropertiesCollections {
	private Properties db_connections;

	public PropertiesCollections() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertiesCollections(Properties db_connections) {
		super();
		this.db_connections = db_connections;
	}

	public Properties getDb_connections() {
		return db_connections;
	}

	public void setDb_connections(Properties db_connections) {
		this.db_connections = db_connections;
	}
	
	
}
