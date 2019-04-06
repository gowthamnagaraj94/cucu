package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormValidate {
	static WebDriver driver;
	Base b=new Base();
	@Given("the user in add customer page")
	public void the_user_in_add_customer_page() {
		 driver=b.getDriver();
		    b.loadUrl("http://demo.guru99.com/telecom/addcustomer.php");
	}
	
	@When("the user details are blank")
	public void the_user_details_are_blank() {
	    System.out.println("keep the fields are blank");
	}

	@When("the user clicks submit button")
	public void the_user_clicks_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see alert message")
	public void the_user_should_see_alert_message() {
	    Alert al=driver.switchTo().alert();
	    String text = al.getText();
	    System.out.println("Alert Mesage is \t :" +text);
	}
}
