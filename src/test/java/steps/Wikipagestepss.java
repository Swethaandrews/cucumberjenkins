package steps;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wikipagestepss {

	@Given("User is on Main page")
	public void user_is_on_main_page() {
	   
		System.out.println("Yes, user is on the main page");
	}

	@Then("User Enters username")
	public void user_enters_username() throws InterruptedException {
		 Wikipagesteps.driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");
		 Thread.sleep(3000);
	}

	@Then("User enters Password")
	public void user_enters_password() throws InterruptedException {
		 Wikipagesteps.driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("admin@123");
		 Thread.sleep(3000);
	}

	@When("User clicks on Login link")
	public void user_clicks_on_login_link() throws InterruptedException {
		 Wikipagesteps.driver.findElement(By.xpath("(//span[text()='Log in'])[1]")).click();
		 Thread.sleep(3000);
	}

	@Then("User clicks on checkbox on login Page")
	public void user_clicks_on_checkbox_on_login_page() throws InterruptedException {
		 Wikipagesteps.driver.findElement(By.xpath("//input[@name='wpRemember']")).click();
		 Thread.sleep(3000);
	}

	@Then("User clicks on Forgot your password? link")
	public void user_clicks_on_forgot_your_password_link() throws InterruptedException {
		 Wikipagesteps.driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		 Thread.sleep(3000);
	}


}
