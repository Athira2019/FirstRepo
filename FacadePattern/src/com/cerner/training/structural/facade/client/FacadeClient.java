package com.cerner.training.structural.facade.client;


import java.sql.Connection;

import com.cerner.training.structural.facade.HelperFacade;
import com.cerner.training.structural.facade.MySqlHelper;
import com.cerner.training.structural.facade.OracleHelper;


public class FacadeClient {

	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		
		Connection connect = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, connect);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}
