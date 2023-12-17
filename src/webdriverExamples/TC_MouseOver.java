package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_MouseOver {
	
//	1.	Declare the DataTypes and Variable inside class outside main method.
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	
public static void main(String[] args) throws Exception{
	
//	2.	Open the Application.
	
	WebDriver driver = new FirefoxDriver();
	
//	3.	Enter the URL.
	
	driver.navigate().to(url);
	
//	4.	Verify the Page Title before login
	
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title Matched before login : " + driver.getTitle());
	}else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}

//	5.	Login into Application.
	
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");

//	6.	Verify the Page Title After login
	
	if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title Matched After Login : " + driver.getTitle());
	}else {
		System.out.println("Title not matched");
	}
	
//	7.	Perform MouseOver using movetoelement action class & click on submenu.
	
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("MouseOver Completed");
	
	Thread.sleep(2000); 
	
//	8.	Click on Add Employee button.
	
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(2000);
	System.out.println("Clicked on Submenu");
	 
//	9.	Logout Completed.
	
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed..");
	
	
//	10.	Close the Application.
	
	driver.close();

}



}
