package com.flipkart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class mobilevalidationsteps {
	
	static WebDriver D;
	static long startTime;
	static String name1;
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		WebDriverManager.chromedriver().setup();
		D = new ChromeDriver();
		D.get("https://www.flipkart.com/");
		D.manage().window().maximize();
		
		
	    
	}

	@Given("user login by entering valid creadentials")
	public void user_login_by_entering_valid_creadentials() {
		WebElement cli = D.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cli.click();
		
		
		
	   
	}

	@When("user search mobile")
	public void user_search_mobile() {
	    WebElement mose = D.findElement(By.xpath("//input[@type='text']"));
	    mose.sendKeys("redmi",Keys.ENTER);
	    
	    
	}

	@When("user click on the mobile name")
	public void user_click_on_the_mobile_name() {
	    	}

	@Then("user validate the mobile names")
	public void user_validate_the_mobile_names() {
	   
	}

}
