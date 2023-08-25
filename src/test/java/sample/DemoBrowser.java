package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBrowser 
{
	WebDriver driver=null;
	
	
	@Test
	public void d1Test()
	{
		System.out.println("Hi");
		String BROWSER = System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("chrome");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
	
	}
}
