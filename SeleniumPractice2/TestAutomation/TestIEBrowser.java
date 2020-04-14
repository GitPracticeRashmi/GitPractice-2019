package TestAutomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestIEBrowser {
	
	static String driverPath = "C:\\Users\\Rashmi\\IEDriverServer_x64_3.150.1\\";
	public WebDriver driver;
	
	
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	

	public void testGooglePageTitleInIEBrowser() {
		System.out.println("*******************");
		System.out.println("navigating to browser");
		driver.navigate().to("http://www.google.com");
		System.out.println("navigating to browser done");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}


	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing IE browser");
			driver.quit();
		}
	}
	public static void main(String[] args)
	{
		TestIEBrowser tib = new TestIEBrowser();
		tib.setUp();
		tib.testGooglePageTitleInIEBrowser();
		tib.tearDown();
	}
	}
