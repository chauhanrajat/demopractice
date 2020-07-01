package com.Selenium.TestCase;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Selenium.TestBase.BaseClass;

import com.beust.jcommander.Parameter;

public class CheckDrivers extends BaseClass{
	


public CheckDrivers() throws Exception{
	super();
	try{
		DateFormat dateFormat=new SimpleDateFormat("ddMMyyyy HHmmss");
		Date date=new Date();
		System.out.println("Date Time of Test Run:-"+dateFormat.format(date));
		
		
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
}

	@Parameters("browser")
	@BeforeMethod()
    public void setUp( String b) throws Exception{
		
        System.out.println("browser name  is:-"+b);
        BaseClass.Initialize(b);
        }
    
    @Test
    public void OpenYoutube() throws Exception{
    	
    	System.out.println("Inside the test");
    	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Covid-19 cases update");
    	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void endSession(){
    	driver.quit();
    }

}
