package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Frames {
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	public static void main(String[] args) throws Exception{
		
//		1.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter and open the URL.
		
		driver.navigate().to(url);
		
//		3.	Login into Application.
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		
//		4.	Perform MouseOver using movetoelement action class & click on submenu.
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("MouseOver Completed");
		
		Thread.sleep(2000); 
		
//		5.	Click on Add Employee button.
		
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		System.out.println("Clicked on Submenu");
		
//		6.	Switch to Frames.
		
		driver.switchTo().frame("rightMenu");
		
		
//		7.	Enter the credentials.
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Panchal");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Omkar");
		driver.findElement(By.id("btnEdit")).click();
		
		System.out.println("New Employee Added");
		
		Thread.sleep(3000);
		
//		7.	Exit from Frames.
		
		driver.switchTo().defaultContent();
		
//		8.	Logout Completed.
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed..");
		
		
//		9.	Close the Application.
		
		driver.close();

	}



}
