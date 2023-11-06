package Amazon_Step_Definiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MouseMovement {
	WebDriver driver;
@Given("login page open in browser")
public void login_page_open_in_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\seleniumJar\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
}

@And("internet connectivity")
public void internet_connectivity() {
    
}

@When("Move mouse on sign in and language")
public void move_mouse_on_sign_in_and_language() {
	
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.id("icp-nav-flyout"))).perform();
	act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();

   
}

@Then("mouse movement successfull")
public void mouse_movement_successfull() {
}

@And("Homepage")
public void homepage() {


}
}
