package webdriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Keyboard_Robot {
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	public static void main(String[] args) throws Exception{
		
//		2.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		3.	Enter the URL.
		
		driver.navigate().to(url);
		
//		3.	Enter the username and password
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
//		4.	Perform keyboard actions (1.TAB 	2.ENTER)
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		System.out.println("TAB");
		
//		5.	Login into Application.
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("ENTER");
		
		Thread.sleep(3000);

//		6.	Logout Completed.
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		
//		7.	Close the Application.
		
		driver.close();

		
		
	}



}
