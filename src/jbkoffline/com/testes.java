package jbkoffline.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import de.bezier.data.XlsReader;

public class testes {

public static WebDriver driver;
//XlsReader reader=new XlsReader("C:\\Users\\Paras pc\\Desktop");

@BeforeSuite(groups="Smoke")
public static WebDriver Setup_Browser() throws Exception{
	
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("file:///D:/jbk/JBK%20Offline/index.html");
	return driver;
}

@Test(priority=1, groups="Regression", description="To cheack project URL is correct:")
public static void Verify_URL(){
	String Act_URL=driver.getCurrentUrl();
	System.out.println("Actual URL is"+Act_URL);
	
	String exp_URL="file:///D:/jbk/JBK%20Offline/index.html";
	
	Assert.assertEquals(Act_URL, exp_URL);
	System.out.println("***************************");
	}

@Test(priority=2, groups="Regression", description="To Verify application Title")
public static void Verify_Title(){
	String Act_Title=driver.getTitle();
	System.out.println("Actual title is"+Act_Title);
	
	String exp_Title="Best Industrial Java Classes | Selenium Training in Pune";
	
	Assert.assertEquals(Act_Title, exp_Title);
	System.out.println("***************************");
	}


@AfterSuite(groups="Smoke")
public void close_Browser(){
	driver.close();
	}
}
