package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testBase.testBase;

public class loginPage extends testBase{
	
	//WebDriver driver;
	
	
	//public loginPage (WebDriver driver) {
		//this.driver=driver;
	//}
	 //By signin = By.xpath("//*[@id=\"DpV_-account-label\"]");
	//By email = By.xpath("//input[@id='v5Yb-username']");
	//By password = By.xpath("//input[@id='v5Yb-password']");
	  //By trips = By.xpath("//*[@id=\"Eapa-trips-link\"]");
			
	public void clicklogin() throws Exception {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"DpV_-account-label\"]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='v5Yb-username']")).sendKeys("WithneyK@gmail.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='v5Yb-password']")).sendKeys("Abcd1234#*");
		//*[@id="Eapa-trips-link"]*/
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("//*[@id=\\\"Eapa-trips-link\\\"]")).click();
	}
	public void tearDown() {
		driver.close();
	}

}

