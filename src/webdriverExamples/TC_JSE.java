package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_JSE {
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	public static void main(String[] args) throws Exception{
		
//		1.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter the URL.
		
		driver.navigate().to(url);
		
//		3.	Login into application (using username and password)
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
//		4.	Click on Login button using javascript executer
		
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);
		
		System.out.println("Implemented javascript executor program");
		
		Thread.sleep(2000);
		
//		5.	Click on logout option
		
		driver.findElement(By.linkText("Logout")).click();
		
//		6.	Close Application or Browser
		
		driver.close();

		
	}

}
