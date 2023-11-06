package Amazon_Step_Definiation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Address_Change {
	WebDriver driver;
	@Given("page should be in open in browser")
	public void page_should_be_in_open_in_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumJar\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	}

	@And("user should be log in and internet connectivity")
	public void user_should_be_log_in_and_internet_connectivity() {
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("urkudesunitaash@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		WebElement paswd=driver.findElement(By.id("ap_password"));
		paswd.sendKeys("sunjink2020");
		driver.findElement(By.id("signInSubmit")).click();
	}

	@When("Click on account and list")
	public void click_on_account_and_list() {
		WebElement acc=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		acc.click();
		
	}

	@And("Click on your address")
	public void click_on_your_address() {
		WebElement add=driver.findElement(By.partialLinkText("Your Addresses"));
		add.click();
	}

	@And("Click on add address")
	public void click_on_add_address() {
		driver.findElement(By.id("ya-myab-plus-address-icon")).click();
	}

	@And("Add information")
	public void add_information() {
		WebElement FullName=driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		FullName.click();
		FullName.sendKeys("Aashish Markandi Urkude");
		
		WebElement mobNo=driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		mobNo.click();
		mobNo.sendKeys("7328826037");
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,500)", "");
		
		WebElement pincode=driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		pincode.click();
		pincode.sendKeys("442401");
		
		WebElement line1=driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		line1.click();
		line1.sendKeys("House no.13");
		
		WebElement line2=driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		line2.click();
		line2.sendKeys("Dhanora");
		
		WebElement landmark=driver.findElement(By.id("address-ui-widgets-landmark"));
		landmark.click();
		landmark.sendKeys("Near Hanuman Mandir");
		
		
	}

	@And("Click on add address button")
	public void click_on_add_address_button() {
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input"));
		submit.click();
	}

	@And("Again click on add address button")
	public void again_click_on_add_address_button() {
		JavascriptExecutor js2=(JavascriptExecutor) driver;
	    js2.executeScript("window.scrollBy(0,500)", "");
	    WebElement submit1=driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input"));
		submit1.click();
	}

	@Then("Address successfully change")
	public void address_successfully_change() {
	    
	}

	@And("home page open")
	public void home_page_open() {
	    
	}




}
