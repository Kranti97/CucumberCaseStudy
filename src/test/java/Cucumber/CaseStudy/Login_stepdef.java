package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Cucumber.CaseStudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login_stepdef {
	
	WebDriver driver;
	
	@Given("^user must be in login page$")
	public void login_page(){
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_credentials(String arg1, String arg2){
		 driver.findElement(By.name("userName")).sendKeys(arg1);
		  driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@When("^user should click on login button$")
	public void login_button(){
		driver.findElement(By.name("Login")).click();
	}

	@Then("^user must be in the home page$")
	public void home_page(){
		Assert.assertEquals("Home",driver.getTitle());
		System.out.println("User has logged in");
	}



}
