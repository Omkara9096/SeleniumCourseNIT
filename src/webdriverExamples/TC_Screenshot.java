package webdriverExamples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Screenshot {
	
	
	public static void main(String[] args) throws Exception {
		
//		1.	Launch the browser
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Try Block 
		
		try {
//			3.	Enter the URL
			
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			
//			4.	Login into Application
			
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nreshit");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000); 
			
//			5.	Perform Mouse Over Action
			
			WebElement element = driver.findElement(By.linkText("PIM"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			Thread.sleep(3000);
		
//			6.	Click on Add Employee
			
			driver.findElement(By.linkText("Add Employee")).click();
			Thread.sleep(4000);
			
			System.out.println("Clicked on Submenu");
			
//			7.	Logout Completed
			
			driver.findElement(By.linkText("Logout")).click();
					
//			8.	Catch Block (Take Screenshot)		
			
		} catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("C:\\NIT_Project\\TestResults.png"));
		}
		
			driver.quit();

	}
	



}
