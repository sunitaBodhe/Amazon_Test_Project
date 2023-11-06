package Amazon_Step_Definiation;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Filter {
	WebDriver driver;
	@Given("Login page should open in default browser")
	public void login_page_should_open_in_default_browser() {
	    
	}

	@And("user should be login")
	public void user_should_be_login() {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumJar\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		//sign in
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys("urkudesunitaash@gmail.com");
	
	driver.findElement(By.id("continue")).click();
	
	WebElement paswd=driver.findElement(By.id("ap_password"));
	paswd.sendKeys("sunjink2020");
	driver.findElement(By.id("signInSubmit")).click();
	}

	@When("search product")
	public void search_product() {
		 WebElement search6=driver.findElement(By.id("twotabsearchtextbox"));
			search6.sendKeys("shoes for women");
			search6.sendKeys(Keys.ENTER);
			JavascriptExecutor js2=(JavascriptExecutor) driver;
	        js2.executeScript("window.scrollBy(0,500)", "");
	        
	       
	}

	@And("add filters on the product")
	public void add_filters_on_the_product() {
		 WebElement filter=driver.findElement(By.linkText("Puma"));
	        filter.click();
	        
	     /*   WebElement filter1=driver.findElement(By.id("low-price"));
	        filter1.click();
	        filter1.sendKeys("1000");
	        
	        WebElement filter2=driver.findElement(By.id("high-price"));
	        filter2.click();
	        filter2.sendKeys("2500");
	        try {
	        WebElement go=driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]"));
	        go.click();
	        }
	        catch(ElementNotInteractableException e) {
	        	
	        }*/
	        
	        
	        JavascriptExecutor js3=(JavascriptExecutor) driver;
	        js3.executeScript("window.scrollBy(0,700)", "");
	        Actions act=new Actions(driver);
	        WebElement filter4=driver.findElement(By.id("a-autoid-7-announce"));//*[@id="p_n_feature_fourteen_browse-bin/29603808031"]/span/a/div/label/i
	        act.moveToElement(filter4).build().perform();
	        
	        JavascriptExecutor js4=(JavascriptExecutor) driver;
	        js4.executeScript("window.scrollBy(0,1000)", "");
	        
	        WebElement filter5=driver.findElement(By.linkText("Lightweight"));
	        act.moveToElement(filter5).build().perform();
	        
	        
	    
	}

	@Then("filter product successfully")
	public void filter_product_successfully() {
	    
	}

	@And("Open Home page")
	public void open_home_page() {
	    
	}
	
	
	
	

}
