package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;


public class FB_Signup {
	
	public static void main(String[] args) throws Exception {
		
		// 1) Launching the Browser
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//2) Use keyboard to signup button by Robot class
		
		Robot r = new Robot();
		
		Thread.sleep(1000);
		
		for(int a=0; a<=3; a++) {
			
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
		}
		
		Thread.sleep(500);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		// 3) Entering Signup Details
		
		driver.findElement(By.name("firstname")).sendKeys("Omkar");
		driver.findElement(By.name("lastname")).sendKeys("Panchal");
		driver.findElement(By.name("reg_email__")).sendKeys("9096960806");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Omkar123");
		
		Thread.sleep(1000);
		
		// 4) Select values from dropdown
		
		Select st = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		st.selectByValue("27");
		Thread.sleep(500);
		
		Select st1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		st1.selectByVisibleText("Nov");
		Thread.sleep(500);
		
		Select st2 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		st2.selectByVisibleText("1997");
		
		// 5) Select option from Radio button
		
		List <WebElement> gender = (List<WebElement>) driver.findElements(By.name("sex"));
		
		int cnt = gender.size();
		System.out.println(cnt);
		
		for(int i=0; i<cnt-1; i++) {
			
			String txt = gender.get(i).getText();
			System.out.println(txt);
			
			gender.get(i).click();
			Thread.sleep(1000);
			
		}
 		
		// Signup details filled successfully and now back to login page
		
		System.out.println("Signup Details submitted successfully");
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("9096960806");
		driver.findElement(By.name("pass")).sendKeys("Quality@123");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(1000);
		
		System.out.println("Login successfully...");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.linkText("Log out")).click();
		
		System.out.println("Logout Successfully");
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
	}
	

}
