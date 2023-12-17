package webdriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Alerts {
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	public static void main(String[] args) throws Exception{
		
//		1.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter and open the URL.
		
		driver.navigate().to(url);
		
//		3.	Login into Application by only entering username.
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(4000);
		
//		4.	Switch to Alerts.
		
		Alert a = driver.switchTo().alert(); 
		
//		5.	Apply getText method.
		
		System.out.println(a.getText());
		
//		6.	Accept the alerts.
		
		a.accept();
		
		Thread.sleep(3000);
		
//		7.	Login into application using password
		
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		
		
//		8.	Logout Completed.
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed..");
		
		
//		9.	Close the Application.
		
		driver.close();
	}
	



}
