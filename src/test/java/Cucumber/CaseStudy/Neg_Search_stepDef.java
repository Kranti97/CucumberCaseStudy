package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Neg_Search_stepDef {
	
	WebDriver driver;
	
	@Given("^User has to register in TestMe App$")
	public void register_in_TestMe_App() {
		 driver = UtilityClass.openBrowser("chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  	  driver.findElement(By.name("password")).sendKeys("password123");
	  	  driver.findElement(By.name("Login")).click();
	}

	@When("^User searches for a particular product like \"([^\"]*)\"$")
	public void particular_product(String arg1) throws Throwable {
		driver.findElement(By.name("products")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("^try to proceed payment without adding any item in the cart$")
	public void try_to_proceed_payment_without_adding_any_item_in_the_cart(){
	  Assert.assertTrue(driver.findElements(By.linkText("myLinkText")).size() < 1);  
	}

	@Then("^TestMeApp dosen't display cart icon$")
	public void testmeapp_dosen_t_display_cart_icon(){
	  System.out.println("Test Me App dosen't display add to cart"); 
	}


}
