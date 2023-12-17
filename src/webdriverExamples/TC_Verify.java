package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Verify {

	public static void main(String[] args) {

//		1.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter the URL.
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
//		3.	Verify the Page Title before login
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title Matched before login : " + driver.getTitle());
		}else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}

//		4.	Login into Application.
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");

//		5.	Verify the Page Title After login
		
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Matched After Login : " + driver.getTitle());
		}else {
			System.out.println("Title not matched");
		}
		
//		6.	Logout Completed.
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed..");
		
		
//		7.	Close the Application.
		
		driver.close();
		
	}
	
	
}
