package com.singletone;

public class SingleToneMain {
	
	public static void main(String[] args) {
		DatabaseConnectionManager databaseConnectionManager1=DatabaseConnectionManager.getInstance();
		
		DatabaseConnectionManager databaseConnectionManager2=DatabaseConnectionManager.getInstance();
		
		System.out.println(databaseConnectionManager1==databaseConnectionManager2);
	}

}
