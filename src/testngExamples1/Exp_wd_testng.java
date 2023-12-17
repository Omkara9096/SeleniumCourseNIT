package testngExamples1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_wd_testng {

	WebDriver driver;
@BeforeClass
public void startUp() {

	driver = new FirefoxDriver();
}

@AfterClass
public void tearDown() {
	driver.close();

}

@Test
public void tc001() throws Exception{
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	
	
}

}
