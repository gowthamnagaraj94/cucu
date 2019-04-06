package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomerDefinitions {
static WebDriver driver;
Base b=new Base();
@Given("the user is in add customer page")
public  void the_user_is_in_add_customer_page() {
    driver=b.getDriver();
    b.loadUrl("http://demo.guru99.com/telecom/addcustomer.php");
}

@When("the user fill in the customer details")
public void the_user_fill_in_the_customer_details(DataTable customerDetails) throws InterruptedException {
	List<String>cust=customerDetails.asList(String.class);
	System.out.println(cust);
	Thread.sleep(2000);
    driver.findElement(By.xpath("//label[text()='Done']")).click();
    driver.findElement(By.id("fname")).sendKeys(cust.get(0));
    driver.findElement(By.id("lname")).sendKeys(cust.get(1));
    driver.findElement(By.id("email")).sendKeys(cust.get(2));
    driver.findElement(By.name("addr")).sendKeys(cust.get(3));
    driver.findElement(By.id("telephoneno")).sendKeys(cust.get(4));
   
    
    
}

@When("the user clicks the submit button")
public void the_user_clicks_the_submit_button() {
    driver.findElement(By.name("submit")).click();
}

@Then("the user should see the customer ID generated")
public void the_user_should_see_the_customer_ID_generated() {
	Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
    
    
}

}
