package helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Fileop 
{
	public String ReadPropertyFile(String key) throws Exception	//created method generic
	
	{
		
		InputStream input = Fileop.class.getClassLoader().getResourceAsStream("config.properties");
		Properties prop = new Properties();
		prop.load(input);				//to load the path
		return prop.getProperty(key); 			// to read
		
	}
}
