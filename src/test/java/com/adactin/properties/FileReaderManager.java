package com.adactin.properties;

import com.adactin.configuratio.ConfigurationReader;

public class FileReaderManager {

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		FileReaderManager helper =new FileReaderManager ();
		
		return helper;		
		
	}
	
	
	
	public ConfigurationReader getInstanceCr() throws Throwable {

		ConfigurationReader cr=new ConfigurationReader ();
		
		return cr;
		
	}
}
