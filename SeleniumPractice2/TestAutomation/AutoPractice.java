package TestAutomation;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoPractice {
	
	WebDriver driver;
	    String url = "http://www.google.com";
		public void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rashmi\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //System.out.println("executed");
        driver.get(url);
      //System.out.println("get url executed");
        
      
        //System.out.println("before wait");
        //WebDriverWait wait = new WebDriverWait(driver,10);
        //System.out.println("after wait");
        //driver.get("http://www.google.com");
        //hplogo is the id of Google logo on google.com
        //System.out.println("after google");
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hplogo")));
     
	}


	public void test() {
		String pageTitle = driver.getTitle();
		//System.out.println("executed 2");
		//Thread.sleep(2000);
		System.out.println("Page titlr " +pageTitle);
	}
	

	
	public void tearDown() {
		driver.close();
		System.out.println("browser closed");
	}
public static void main(String[] args) {
	AutoPractice ap = new AutoPractice();
	ap.setUp();
	ap.test();
	ap.tearDown();
		
	}

}
