package Amazon_Step_Definiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Page_Steps {
	WebDriver driver;

@Given("Login page should be open in default browser")
public void login_page_should_be_open_in_default_browser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\seleniumJar\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
    
}

@And("internet connectivity should be available")
public void internet_connectivity_should_be_available() {
    
}

@When("Click on username field")
public void click_on_username_field() {
	WebElement email=driver.findElement(By.id("ap_email"));
	email.click();
	
    }
//*[@id="ap_email"]
@And("enter valid username")
public void enter_valid_username() {
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys("urkudesunitaash@gmail.com");
	//driver.findElement(By.cssSelector("input[id=\"ap_email\"]")).sendKeys("urkudesunitaash@gmail.com");
}
@And("Click on continue button")
public void click_on_continue_button() {
	driver.findElement(By.id("continue")).click();
    
}

@And("Click on password field")
public void click_on_password_field() {
	WebElement paswd=driver.findElement(By.id("ap_password"));
	paswd.click();
	
	
}

@And("enter valid password")
public void enter_valid_password() {
	WebElement paswd=driver.findElement(By.id("ap_password"));
	paswd.sendKeys("sunjink2020");
}

@Then("Click on sign in button")
public void click_on_sign_in_button() {
	driver.findElement(By.id("signInSubmit")).click();
}

@And("login successfully")
public void login_successfully() {
    
}

@And("open home page")
public void open_home_page() {
   
}

}
