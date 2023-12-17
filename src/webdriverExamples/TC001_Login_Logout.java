package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC001_Login_Logout {
	public static void main(String[] args) throws Exception {
		// To Launch the browser
		
		WebDriver driver = new FirefoxDriver();
		
	
		Thread.sleep(3000);
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.manage().window().maximize();
		
	
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		// To perform click action 
		
		 driver.findElement(By.name("Submit")).click();
		 Thread.sleep(3000); 
		 
		 System.out.println("Login completed");
		 
		 // To perform logout 
		 
		 driver.findElement(By.linkText("Logout")).click();
		 
		 Thread.sleep(1000);
		 
		 System.out.println("Logout completed");
		 
		 
		 driver.close();
		 
		 
		
	}

}
