package jbkoffline.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import de.bezier.data.XlsReader;

public class CITC {
	public static WebDriver driver;
	jbkoffline.com.XlsReader reader=new jbkoffline.com.XlsReader("C:\\Users\\Paras pc\\Desktop\\testes.xlsx");

	@BeforeSuite(groups="Smoke")
	public static WebDriver Setup_Browser() throws Exception{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/jbk/JBK%20Offline/index.html");
		return driver;
	}}
	
	/*public void Contact()
	{
		WebElement ele = driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[12]/a"));
		
		String actualContact= ele.getText();
		System.out.println(actualContact );
		//ele.click();
		
		String expectedContact = null;
		try {
			expectedContact = reader
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(expectedMybook);
		
		Assert.assertEquals(expectedMybook, actualMybook);
		


}*/
