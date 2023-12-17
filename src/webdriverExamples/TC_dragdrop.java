package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_dragdrop {
	public static void main(String[] args) throws Exception{
		
//		1.	Launch the browser
		
		WebDriver driver = new FirefoxDriver();
		
//		2.	Enter the URL
		
		driver.get("https://jqueryui.com/draggable/");
		
//		3.	Verify the Title in case of fail
		
		if (driver.getTitle().equals("Droppable | jQuery UI") ){
			System.out.println("Title Matched");
		}else {
			System.out.println("Title not Matched");
		}
		
		driver.findElement(By.linkText("Droppable")).click();
		
//		4.	Enter into frame
		
		driver.switchTo().frame(0);
		
//		5.	Perform drag&drop using action class
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		System.out.println("Drag&Drop Successfully Performed...");
		Thread.sleep(4000);
		
//		6.	Exit from frame
		
		driver.switchTo().defaultContent();
		
//		7.	Close the Application
		
		driver.close();

	}

}
