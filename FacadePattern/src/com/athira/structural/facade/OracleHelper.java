package com.athira.structural.facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		System.out.println("Oracle pdf report generated");
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		System.out.println("Oracle html report generated");
	}
	
}
