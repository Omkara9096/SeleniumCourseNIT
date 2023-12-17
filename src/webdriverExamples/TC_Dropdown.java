package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	public static void main(String[] args) throws Exception{
		
//		1.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter the URL.
		
		driver.navigate().to(url);
		
//		3.	Login into application (using username and password).
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		
		Thread.sleep(2000);
		
//		4.	Select Employee ID from Searchby dropdown.
		
		driver.switchTo().frame("rightMenu");
		
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		
//		5.	Enter employee ID in search for textboxes.
		
		driver.findElement(By.name("loc_name")).sendKeys("2246");
		Thread.sleep(2000);
		
//		6.	Click on search button.
		
		driver.findElement(By.xpath("//input[@value = 'Search']")).click();
		
		Thread.sleep(2000);

//		7.	click on checkbox.
		
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(2000);
		
//		8.	Click on delete button.
		
		driver.findElement(By.xpath("//input[@value = 'Delete']")).click();
		Thread.sleep(2000);
		System.out.println("Employee Id Deleted");
		
		driver.switchTo().defaultContent();
		
//		9.	Click on logout option
		
		driver.findElement(By.linkText("Logout")).click();
		
//		10.	Close Application or Browser
		
		driver.close();

	}

}
