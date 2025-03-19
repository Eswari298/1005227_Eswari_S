package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.capstone.objectutility.AddToCart;
import com.capstone.objectutility.CheckOut;

import com.capstone.objectutility.HomePage;
import com.capstone.objectutility.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo{
	
		WebDriver driver = new EdgeDriver();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		AddToCart ac = new AddToCart(driver);
		CheckOut chk = new CheckOut(driver);
			
		@Given ("user is on login page")
		public void launch() {
										
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/v1/");
			System.out.println("Application launched successfully");
			
		}
			
		@When ("user enters username and password")	
		public void EnterCreds() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			lp.getUsername().sendKeys("standard_user");
			lp.getPassword().sendKeys("secret_sauce");
			System.out.println("User entered username and password");
			
		}
			
		@And ("user click on login button")
		public void clicks_on_login_button() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			lp.getLoginBtn().click();
			System.out.println("User clicked on Login button successfully");
			
			
			if (driver.getTitle().equals("Swag Labs")) {
				System.out.println("Swag lab home page is displayed");
			}
				else {
					System.out.println("Swag lab home page is not displayed");
				}
			}
		
		@Given("user click on Add to cart for products")
		public void user_click_on_Add_to_cart_for_products() throws InterruptedException {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			hp.getProd1().click();			
			Thread.sleep(2000);
			
			hp.getProd2().click();
			Thread.sleep(2000);
			
			hp.getProd3().click();
			Thread.sleep(2000);
			
			System.out.println("Product added to the cart");
			
		}
			
			@And("user clicks on cart button")
			public void user_clicks_on_cart_button() throws InterruptedException {
				ac.getAddToCartBtn().click();				
				Thread.sleep(2000);
			}	
				
			@Then("user can view the products in cart")
			public void user_can_view_the_products_in_cart() throws InterruptedException {
				System.out.println("Product 1" + driver.getPageSource().contains("Sauce Labs Backpack"));
				System.out.println("Product 2" + driver.getPageSource().contains("Sauce Labs Bolt T-Shirt"));
				System.out.println("Product 3" + driver.getPageSource().contains("Sauce Labs Onesie"));
				Thread.sleep(2000);
			
		}
			
			@Given("user clicks on checkout button")
			public void user_clicks_on_checkout_button() throws InterruptedException {
				ac.getCheckOut().click();
				Thread.sleep(2000);
			}
				
			
			@Then("user enters firstname, lastname and zip code")
			public void user_checks_the_information() throws InterruptedException {
				chk.getFirstName().sendKeys("Eswari");
				Thread.sleep(2000);
				
				chk.getLastName().sendKeys("S");
				Thread.sleep(2000);
			
				chk.getPostalCode().sendKeys("560078");
				Thread.sleep(2000);
			}
			
			@And("user clicks on continue and finish button")
			public void user_clicks_on_continue_finish_button() throws InterruptedException{
				
				chk.getContinueBtn().click();
				Thread.sleep(2000);
				
				chk.getFinishBtn().click();
				Thread.sleep(2000);
			}
			
			@Then("user can see the message Thank you for your order")
			public void user_can_see_the_message_thank_you_for_your_order() throws InterruptedException {
				System.out.println(driver.getPageSource().contains("Thank you for your order!"));
				System.out.println(driver.getPageSource().contains("Your order has been dispatched, and will arrive just as fast as the pony can get there!"));
				Thread.sleep(5000);
				
				driver.quit();
			}
				
			}



		

