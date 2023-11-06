package Amazon_Step_Definiation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_And_AddToCart_Delete_Steps {
	WebDriver driver;
	@Given("Login page should  open in default browser")
	public void login_page_should_open_in_default_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumJar\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	}

	@And("User should  already login")
	public void user_should_already_login() {
		
		
		//sign in
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys("urkudesunitaash@gmail.com");
	
	driver.findElement(By.id("continue")).click();
	
	WebElement paswd=driver.findElement(By.id("ap_password"));
	paswd.sendKeys("sunjink2020");
	driver.findElement(By.id("signInSubmit")).click();
	}

	
	@When("Search product")
	public void search_product() {
		WebElement search5=driver.findElement(By.id("twotabsearchtextbox"));
		search5.sendKeys("shoes for women");
		search5.sendKeys(Keys.ENTER);
	    
	}

	@And("click on the product")
	public void click_on_the_product() {
		JavascriptExecutor js1=(JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.linkText("Women's Cute Sports Running Shoes,Walking, Gym Casual Sneaker Lace-Up Shoes for Girl's")).click();
	    
	}

	@And("click on add to cart button")
	public void click_on_add_to_cart_button() {
		driver.get("https://www.amazon.in/ASIAN-Womens-Multicolored-Running-Walking/dp/B0855NXGXM/ref=sr_1_5?keywords=shoes+for+women&qid=1698596907&sr=8-5");
		JavascriptExecutor js1=(JavascriptExecutor) driver;
    js1.executeScript("window.scrollBy(0,500)", "");
   WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		//driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			
		}
	

	@And("go to the cart")
	public void go_to_the_cart() {
		driver.navigate().to("https://www.amazon.in/cart/smart-wagon?newItems=Cc0136b00-344b-40e8-b1ec-a5ddb3a6d17d,1&ref_=sw_refresh");
		//driver.findElement(By.id("nav-cart-count-container")).click();
	    
	}

	@And("delete the product")
	public void delete_the_product() {
		//JavascriptExecutor js4=(JavascriptExecutor) driver;
       // js4.executeScript("window.scrollBy(0,300)", "");
	  // driver.findElement(By.xpath("//*[@id=\"sc-item-9d87af85-1b04-491a-9db9-fc9aeb97d445\"]/div[3]/div[7]/div[2]/div/span/span/span/input")).click(); 
	}

	@Then("product deleted successfuly")
	public void product_deleted_successfuly() {
	  
	}

	@And("Home page")
	public void home_page() {
	    
	}

}
