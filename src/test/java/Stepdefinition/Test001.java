package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test001 {
	
	WebDriver driver;
	
	@Given("^open required url$")
	public void open_required_url() throws Throwable {
		
		System.out.println("chrome browser");
		System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.close();
	    
	}


}
