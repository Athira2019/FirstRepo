package com.unittesting.bmi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * This class reads 
 * @author AS045216
 *
 */
public class BMIDiagnosticResultLoader {
	private static Properties diagnosticResults = null;
	

	
	String getResultsText(BMIRange range){
		
		
		loadDiagnosticResults();
		return diagnosticResults.getProperty(range.key());
		
	}
	
	private void loadDiagnosticResults(){
		if (diagnosticResults != null){
			return;
		}
		Properties property= new Properties();
		InputStream loadLocation = null;
		try{
			loadLocation = BMIDiagnosticResultLoader.class.getResourceAsStream("diagnostic.properties");
			//System.out.println("test"+loadLocation);
			property.load(loadLocation);
			if (loadLocation != null){
				loadLocation.close();
			}
			diagnosticResults = property;
		} catch (IOException ioe) {
			if (loadLocation != null){
				try{
					loadLocation.close();
				}
				catch(IOException ioe2){
					// Fail silently, an error already occurred, just different than expected.
				}
			}
			ioe.getMessage();
		} catch (NullPointerException ex ) {
    		ex.getMessage();
		}
	}


	
}
