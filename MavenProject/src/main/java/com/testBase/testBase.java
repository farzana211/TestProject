package com.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   
public class testBase {
	
	public static Properties prop;
	public static WebDriver driver;  


public void initialization() throws Exception {
	//connection with config.properties file
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Zubair\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\config\\config.properties");
			prop.load(fis);
	System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.get(prop.getProperty("url"));
	
}

}