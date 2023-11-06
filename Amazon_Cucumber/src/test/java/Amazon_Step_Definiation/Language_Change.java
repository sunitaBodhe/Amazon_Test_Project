package Amazon_Step_Definiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Language_Change {
	WebDriver driver;
	@Given("page should  in open in browser")
	public void page_should_in_open_in_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumJar\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@And("user should be loggin and internet connectivity")
	public void user_should_be_loggin_and_internet_connectivity() {
	   
	}

	@When("Click on language change field")
	public void click_on_language_change_field() {
		driver.findElement(By.id("icp-nav-flyout")).click();
	}

	@And("Click on language")
	public void click_on_language() {
		WebElement lang=driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[9]/div/label/i"));
		lang.click();
	}

	@And("Click on save changes button")
	public void click_on_save_changes_button() {
		 WebElement submit=driver.findElement(By.id("icp-save-button"));
		  submit.click();
	}
	@Then("Language change successfully")
	public void language_change_successfully() {
	   
	}

	@And("Homepage open")
	public void homepage_open() {
	    
	}

}
