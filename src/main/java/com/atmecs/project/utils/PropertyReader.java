package com.atmecs.project.utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

/**
 * purpose:Property file Reader(read the data from property file)
 * @author ranjitha.selvam
 * @throws IOException 
 *
 */

public class PropertyReader {
	public static String read(String path,String elements) throws IOException
	{
		Properties properties= new Properties();
		FileInputStream reader=new FileInputStream(path);
		properties.load(reader);
		String data = properties.getProperty(elements);
		return data;
	}

}
