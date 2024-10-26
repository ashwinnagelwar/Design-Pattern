package com.singletone;

public class DatabaseConnectionManager {

	
	private static DatabaseConnectionManager databaseConnectionManager;
	
	private DatabaseConnectionManager()
	{
		
	}
	
	
	public static DatabaseConnectionManager getInstance()
	{
		if(databaseConnectionManager==null)
		{
			databaseConnectionManager= new DatabaseConnectionManager();
		}
		return databaseConnectionManager;
	}
}
