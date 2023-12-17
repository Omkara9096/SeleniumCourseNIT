package testngExamples1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exp_Testng {

@BeforeMethod
public void login() {
	System.out.println("Login Completed");
}
@AfterMethod
public void logout() {
	System.out.println("Logout Completed");
}

@Test(priority = 2)
public void addemp() {
	System.out.println("Employee Added");
}

@Test(priority = 1)
public void delemp() {
	System.out.println("Employee Deleted");
}

}
