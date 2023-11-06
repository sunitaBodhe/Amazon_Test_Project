package Amazon_Step_Definiation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiple_search_Step_Defination {
 WebDriver driver;
	@Given("User should be already login")
	public void user_should_be_already_login() {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumJar\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
	    
	}

	@And("search first product")
	public void search_first_product() {
		WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
		search1.click();
		search1.sendKeys("Bag");
		
	}

	@And("enter submit button")
	public void enter_submit_button() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.navigate().back();
	}

	@And("Search second product")
	public void search_second_product() {
		WebElement search2=driver.findElement(By.id("twotabsearchtextbox"));
		search2.click();
		search2.sendKeys("watch");
		
		
	  
	}
	@And("enter  button")
	public void enter_button() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.navigate().back();
	    
	}
	@And("Search third product")
	public void search_third_product() {
		WebElement search3=driver.findElement(By.id("twotabsearchtextbox"));
		search3.click();
		search3.sendKeys("chair");
		
	}
	
	@And("enter submit")
	public void enter_submit() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.navigate().back();
	}
	@Then("Product Search successfully")
	public void product_search_successfully() {
	    driver.close();
	}

	@Then("Home page open")
	public void home_page_open() {
	   
	}
}
