package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigfile {

	Properties properties;
	String path = "C:\\Users\\Shashikant\\eclipse-workspace\\LearningTestNG\\src\\main\\java\\PropertiesFileDemo\\configtxt.txt";
	
	public ReadConfigfile() throws IOException
	{
		properties = new Properties();
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
	
	}
	
	
	public String getURLL() {
		String url = properties.getProperty("url");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("url not specified in config file.....");
	}
	
	public String getUsername() {
		String url = properties.getProperty("username");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("username not specified in config file.....");
	}
	
	
	
	public String getPassword() {
		String url = properties.getProperty("password");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("password not specified in config file.....");
	}
	
	
	
}
