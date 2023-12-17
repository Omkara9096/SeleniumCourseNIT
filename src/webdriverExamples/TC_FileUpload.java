package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_FileUpload {
	
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	
	public static void main(String[] args) throws Exception {
		
//		1.	Open the Application.
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter the URL.
		
		driver.navigate().to(url);
		
//		3.	Login into application (using username and password)
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		
		System.out.println("Login completed");
		
//		4.	Switch to Frames
		
		driver.switchTo().frame("rightMenu");
		
//		5.	Click on Add employee button & fill require details
		
		driver.findElement(By.xpath("//input[@value = 'Add']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Panchal");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Omkar");
		
//		6.	Select WebElement for image
		
		WebElement fileInput = driver.findElement(By.xpath("//input[@type = 'file'][@name = 'photofile']"));
		
//		7.	Provide path of image (file uploaded successfully)
		
		fileInput.sendKeys("C:\\krishna.jpeg");
		
		Thread.sleep(2000);
		
		System.out.println("File Uploaded Successfully");

//		8.	Exit from frames
		
		driver.switchTo().defaultContent();
		
//		9.	Click on logout option
		
		driver.findElement(By.linkText("Logout")).click();
		
//		10.	Close Application or Browser
		
		driver.close();
		
	}
	



}
