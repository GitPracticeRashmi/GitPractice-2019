package TestAutomation;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4_LoginLogout {
	WebDriver driver;
    String url = "https://login.yahoo.com/";
    
    @Before
	public void setUp() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Rashmi\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    //System.out.println("executed");
    driver.get(url);}
	
    

	@Test
	public void test() throws InterruptedException{
		System.out.println("******************");
		System.out.println("XPath for login");
		//driver.findElement(By.xpath("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com")).click();
	    //Thread.sleep(60);
	    //System.out.println("******************");
		//System.out.println("username");
		driver.findElement(By.id("login-username")).sendKeys("autoprac@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("Practice-2019");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div[1]/div[2]/ul/li[3]/a/span")).click();
		//WebElement sortopt = driver.findElement(By.name("Sort"));
	    //Select selectsort = new Select(sortopt);
	    //selectsort.deselectByIndex(2);
		WebElement sortopt = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div/button/span"));
		//System.out.println(ele.getText());
		//sortopt.click();
		WebElement opt = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[7]/div/div[1]/div/ul/li[2]/button/span[2]"));
		//System.out.println(ele.getText());
		//System.out.println(opt.getText());
		opt.click();
	}

}
