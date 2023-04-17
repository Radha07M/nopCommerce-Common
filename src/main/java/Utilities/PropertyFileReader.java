package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
	private static FileInputStream fis=null;
	public InputStream ins = null;
	Properties prop;
	
	public String getProperties(String filePath, String propName) throws IOException{
		prop = new Properties();
		String propValue="";
		try {
			fis = new FileInputStream(filePath);
			prop.load(fis);
			propValue = prop.getProperty(propName);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				// TODO: handle exception
			}
		}
		return propValue.trim();
	}
}
