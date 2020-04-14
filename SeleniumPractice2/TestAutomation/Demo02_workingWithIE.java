package TestAutomation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Demo02_workingWithIE {
	WebDriver driver;
	String url = "http://www.ndtv.com";
	@Before
	public void setUp() {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Rashmi\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe" );

		//InternetExplorerProfile fp = new InternetExplorerProfile();
		//fp.setPreference("webdriver.load.strategy","unstable");
		driver = new InternetExplorerDriver();
//driver.manage().window().maximize();
System.out.println("executed");
driver.get(url);
//System.out.println("executed");
	}

	@Test
	public void test() {
		String pageTitle = driver.getTitle();
		System.out.println("executed 2");
		//Thread.sleep(2000);
		System.out.println("Page titlr " +pageTitle);
	}
	
	@After
	
	public void tearDown() {
		driver.close();
	}

}
