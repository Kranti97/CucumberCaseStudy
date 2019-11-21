package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SearchFile_StepDef {
	WebDriver driver;
	
	@Given("^User must be in login page$")
	public void login_page() {
		 driver = UtilityClass.openBrowser("chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.linkText("SignIn")).click();
		  
	}

	@Then("^User should enter valid credentials$")
	public void valid_credentials(){
		  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  	  driver.findElement(By.name("password")).sendKeys("password123");
	  	  driver.findElement(By.name("Login")).click();
	}

	@When("^user enters first four letters \"([^\"]*)\"$")
	public void first_four_letters(String arg1) {
		driver.findElement(By.name("products")).sendKeys(arg1);
	}

	@When("^selects the products$")
	public void selects_the_products(){
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	}

	@When("^clicks on find details$")
	public void clicks_on_find_details(){
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		driver.findElement(By.linkText("Add to cart")).click();
	}

	@Then("^add the item to cart$")
	public void add_the_item_to_cart() {
		Assert.assertEquals("Search",driver.getTitle());
		 System.out.println("Product Successfully added to cart!!!!");
	}

	@When("^user searches for a particular product like \"([^\"]*)\"$")
	public void user_searches_for_a_particular_product_like(String arg1){
		driver.findElement(By.name("products")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("^try to proceed payment without adding item in the cart$")
	public void try_to_proceed_payment_without_adding_item_in_the_cart() {
		Assert.assertTrue(driver.findElements(By.linkText("myLinkText")).size() < 1); 
	}

	@Then("^TestMe App dosen't display cart icon$")
	public void testme_App_dosen_t_display_cart_icon(){
		System.out.println("Test Me App dosen't display add to cart"); 
	}


}
