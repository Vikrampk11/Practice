package JavaBasics.Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class App {

  public static void main(String[] args) throws IOException {
	App app = new App();
	app.printThemAll();
  }

  private void printThemAll() throws IOException {

//	Properties prop = new Properties();
//	InputStream input = null;
//
//	try {
//
//		String filename = "./Attachements/config.properties";
//		input = getClass().getClassLoader().getResourceAsStream(filename);
//		if (input == null) {
//			System.out.println("Sorry, unable to find " + filename);
//			return;
//		}
//
//		prop.load(input);
		File file = new File("./config.properties"); 
        FileInputStream fileInput = new FileInputStream(file); 
        Properties prop = new Properties(); 
        prop.load(fileInput);
		Enumeration<?> e = prop.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = prop.getProperty(key);
			System.out.println("Key : " + key + ", Value : " + value);
		}

	
		}
	

  }

