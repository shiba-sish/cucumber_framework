package allFeatures_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_login_step_defination {

	public WebDriver driver;
	
	@Given("^The user has to be in register page$")
	public void the_user_has_to_be_in_register_page() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("http://127.0.0.1:5000/register");
	  Thread.sleep(500);
	}

	@When("^user enter the username$")
	public void user_enter_the_username() throws InterruptedException {
	    driver.findElement(By.id("exampleInputEmail1")).sendKeys("shibasish8");
	    Thread.sleep(1000);
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws InterruptedException {
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		    Thread.sleep(1000);
	}

	@When("^user clicks the register button$")
	public void user_clicks_the_register_button() throws InterruptedException {
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(1000);
	}

	@Then("^the user should be navigated to login page of ecoders application$")
	public void the_user_should_be_navigated_to_login_page_of_ecoders_application() throws InterruptedException {
	  String expectedTitle = "FLASK-CRUD_APP_login_page.";
	  String actualTitle= driver.getTitle();
	  if (actualTitle.equals(expectedTitle)) {
		  System.out.println("Test case pass & title matched successfully registered!!!");
	  }
	  else {
		  System.out.println("Test case fail & title not matched registration failed!!!");
	  }
	  Thread.sleep(1000);
	  driver.quit();
	}
	@Given("^The user should be in login page$")
	public void the_user_should_be_in_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		  driver.get("http://127.0.0.1:5000/login");
		  Thread.sleep(500);
	}

	@When("^enter valide username to username text field$")
	public void enter_valide_username_to_username_text_field() throws InterruptedException {
	    driver.findElement(By.id("exampleInputEmail1")).sendKeys("shibasish6");
	    Thread.sleep(1000);
	}

	@When("^enter valide password to password text field$")
	public void enter_valide_password_to_password_text_field() throws InterruptedException {
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		    Thread.sleep(1000);
	}

	@When("^click the sing in button$")
	public void click_the_sing_in_button() {
		 driver.findElement(By.xpath("//button[@class='btn text-light']")).click();
	}

	@Then("^user should be navigated to dashboard page$")
	public void user_should_be_navigated_to_dashboard_page() throws InterruptedException {
		String expectedTitle = "FLASK-CRUD_APP_Dashboard_page.";
		  String actualTitle= driver.getTitle();
		  if (actualTitle.equals(expectedTitle)) {
			  System.out.println("Test case pass & Title matched login successfully!!!");
		  }
		  else {
			  System.out.println("Test case fail & Title not matched!!!");
		  }
		  Thread.sleep(1000);
		  driver.quit();
		}
}
