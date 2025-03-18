package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo {
	
		public static WebDriver driver;
			
		@Given ("user is on login page")
		public void launch() {
			driver = new EdgeDriver();
					
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/v1/");
			//System.out.println("Application launched successfully");
		}
			
		@When ("user enters username and password")	
		public void EnterCreds() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement username = driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			System.out.println("User entered username and password");
		}
			
		@And ("user click on login button")
		public void clicks_on_login_button() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement LoginBtn = driver.findElement(By.id("login-button"));
			LoginBtn.click();
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
			WebElement prod1 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
			prod1.click();
			Thread.sleep(2000);
			
			WebElement prod2 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]"));
			prod2.click();
			Thread.sleep(2000);
			
			WebElement prod3 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[3]"));
			prod3.click();
			Thread.sleep(2000);
		}
			
			@And("user clicks on cart button")
			public void user_clicks_on_cart_button() throws InterruptedException {
				WebElement AddToCartBtn = driver.findElement(By.xpath("//*[name()='svg']"));
				AddToCartBtn.click();
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
				//WebElement CheckOut = driver.findElement(By.partialLinkText("//a[contains(@href, 'checkout')]"));
				WebElement CheckOut = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
				
				CheckOut.click();
				Thread.sleep(2000);
			}
				
			@Then("user enters firstname, lastname and zip code")
			public void user_checks_the_information() throws InterruptedException {
				WebElement firstName = driver.findElement(By.id("first-name"));
				firstName.sendKeys("Eswari");
				Thread.sleep(2000);
				
				WebElement lastName = driver.findElement(By.id("last-name"));
				lastName.sendKeys("S");
				Thread.sleep(2000);
				
				WebElement PostalCode = driver.findElement(By.id("postal-code"));
				PostalCode.sendKeys("560078");
				Thread.sleep(2000);
			}
			
			@And("user clicks on continue and finish button")
			public void user_clicks_on_continue_finish_button() throws InterruptedException {
				WebElement continueBtn = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
				continueBtn.click();
				Thread.sleep(2000);
				
				WebElement finishBtn = driver.findElement(By.partialLinkText("FINISH"));
				finishBtn.click();
				Thread.sleep(2000);
			}
			
			@Then("user can see the message Thank you for your order")
			public void user_can_see_the_message_thank_you_for_your_order() throws InterruptedException {
				System.out.println("Order placed successfully? "+ driver.getPageSource().contains("Thank you for your order!"));
				Thread.sleep(2000);
			}
				
			}



		

