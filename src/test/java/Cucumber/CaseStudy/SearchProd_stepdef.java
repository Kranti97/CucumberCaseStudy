package Cucumber.CaseStudy;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import Cucumber.CaseStudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SearchProd_stepdef {
	WebDriver driver;
	
	@Given("^user must be in the search page$")
	public void search_page() {
	  driver = UtilityClass.openBrowser("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
  	  driver.findElement(By.name("password")).sendKeys("password123");
  	  driver.findElement(By.name("Login")).click();
	}

	@When("^user enters first letters \"([^\"]*)\"$")
	public void first_letters(String arg1){
		driver.findElement(By.name("products")).sendKeys(arg1);
	}

	@When("^selects the product$")
	public void selects_the_product(){
	   driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	}

	@When("^clicks on find$")
	public void clicks_on_find(){
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		driver.findElement(By.linkText("Add to cart")).click();
	}

	@Then("^user is able to add to cart$")
	public void add_to_cart()  {
		
		 Assert.assertEquals("Search",driver.getTitle());
		 System.out.println("Product Successfully added to cart!!!!");
	}



}
