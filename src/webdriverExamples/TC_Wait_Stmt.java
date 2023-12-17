package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Wait_Stmt {
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	public static void main(String[] args) {
		
//		1.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter the URL.
		
		driver.navigate().to(url);
		
//		3.	Login into application (using username and password)
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
//		4.	Perform Explicit wait functions // Element to be clickable (conditions)
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='Submit']")));
		
//		5.	Click on Submit button
		
		driver.findElement(By.name("Submit")).click();		

//		6.	Perform Implicit Wait functions (until page avail)
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("Login completed");
		
//		7.	Click on logout option
		
		driver.findElement(By.linkText("Logout")).click();
		
//		8.	Close Application or Browser
		
		driver.close();

		
	}

}
