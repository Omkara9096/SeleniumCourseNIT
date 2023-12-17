package javaExamples;

// Examples of Interface

interface WebDriver{
	public void openApp();
	public void closeApp();

}

class FirefoxDriver implements WebDriver{
	public void openApp() {
		System.out.println("firefox Open");	
	}
	public void closeApp() {
		System.out.println("firefox Close");
	}
	
}

public class ChromeDriver implements WebDriver {
	public void openApp() {
		System.out.println("Chrome Open");
		
	}
	public void closeApp() {
		System.out.println("Chrome Close");
		
	}
	
public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.openApp();
		driver.closeApp();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.openApp();
		driver1.closeApp();
	}

}
