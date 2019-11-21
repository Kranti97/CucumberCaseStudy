package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import  Cucumber.CaseStudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Reg_StepDef {
	WebDriver driver;
	
	@Given("^User must be on the registration page$")
	public void registration_page() {
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^User enter \"([^\"]*)\" as the username$")
	public void username(String arg1){
		 driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^enter \"([^\"]*)\" as the first name$")
	public void first_name(String arg1){
		 driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^enter \"([^\"]*)\" as last name$")
	public void last_name(String arg1){
		 driver.findElement(By.name("lastName")).sendKeys(arg1);
	}
	@When("^enter \"([^\"]*)\" as the password$")
	public void password(String arg1){
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^enter \"([^\"]*)\" as the confirm password$")
	public void confirm_password(String arg1){
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^select female in gender$")
	public void gender(){
		driver.findElement(By.xpath("//input[@value='Female' and @type='radio']")).click();
	}

	@When("^enter \"([^\"]*)\" in emailaddress$")
	public void emailaddress(String arg1){
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^enter \"([^\"]*)\" as mobile number$")
	public void mobile_number(String arg1){
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^enter \"([^\"]*)\" as date of birth$")
	public void date_of_birth(String arg1){
		 driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^enter \"([^\"]*)\" as address$")
	public void address(String arg1){
		driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^user should select a security question$")
	public void security_question() {
		Select sel = new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(2);
	}

	@When("^enter \"([^\"]*)\" as answer$")
	public void answer(String arg1){
		 driver.findElement(By.name("answer")).sendKeys(arg1);
	}

	@When("^User should click on register button$")
	public void register_button(){
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("^User should be redirected to the login page$")
	public void login_page(){
		 Assert.assertEquals("Login",driver.getTitle());
		 System.out.println("User registered successfully!!!");
	}




}
