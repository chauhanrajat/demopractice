package com.Selenium.TestBase;

import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

public static WebDriver driver;
public static Properties pro;
public static String currentDir;

public BaseClass() throws IOException{
	pro = new Properties();
	currentDir=System.getProperty("user.dir");
	
	System.out.println("Current Working Directory:"+currentDir);
	
	FileInputStream FI=new FileInputStream(currentDir+"\\src\\main\\java\\com\\Selenium\\Resources\\test.properties");
	
	pro.load(FI);
	
}

public static void Initialize(String Browsername) throws Exception{
	System.out.println(Browsername);
	if(Browsername.equalsIgnoreCase("chrome")){
		System.out.println("Yhan AA gya");
		System.setProperty(pro.getProperty("chrome_key"), pro.getProperty("chrome_path"));
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start maximized");
		options.addArguments("diable-infobars");
		options.setExperimentalOption("useAutomationExtension", true);
		
		
		driver=new ChromeDriver();
		
	}
	
	else if(Browsername.equalsIgnoreCase("IE")){
		System.out.println("Yhan AA gya");
		System.setProperty(pro.getProperty("ie_key"), pro.getProperty("ie_path"));
		
		
//		options.addArguments("start maximized");
//		options.addArguments("diable-infobars");
//		options.setExperimentalOption("useAutomationExtension", false);
//		
		
		driver=new InternetExplorerDriver();
		System.out.println("browser launched Successfully");
		
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.navigate().to("https://www.google.com/");
	System.out.println("next checkpoint");
	System.out.println("App Launched successfullly");
}
}
