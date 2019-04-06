package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ErrorMsg {
	static WebDriver driver;
	Base b=new Base();
	@Given("the user directs to add customer page")
	public void the_user_directs_to_add_customer_page() {
	    driver=b.getDriver();
	    b.loadUrl("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("the user enters invalid data in the fields")
	public void the_user_enters_invalid_data_in_the_fields(DataTable customerDetails) throws InterruptedException {
	List<List<String>>cust=customerDetails.asList(String.class);
		System.out.println(cust);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    try {
	    driver.findElement(By.id("fname")).sendKeys(cust.get(1).get(0));
	    driver.findElement(By.id("lname")).sendKeys(cust.get(1).get(1));
	    driver.findElement(By.id("email")).sendKeys(cust.get(1).get(2));
	    driver.findElement(By.name("addr")).sendKeys(cust.get(1).get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(cust.get(1).get(4));
	    }
	    catch(Exception e)
	    {
	    	String msg = e.getMessage();
	    	System.out.println(msg);
	    }
	    catch(Throwable e1)
	    {
	    	String m2 = e1.getMessage();
	    	System.out.println(m2);
	    }
	    
	}

	@Then("the user should see error message")
	public void the_user_should_see_error_message() {
	    System.out.println("error message");
	}

}
