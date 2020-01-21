package org.stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefine {

	
	static WebDriver driver;
	
	@Given("user launches the bowser and application")
	public void user_launches_the_bowser_and_application() {
	 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhid\\eclipse-workspace\\CucuList\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enters login credentials")
	public void user_enters_login_credentials(io.cucumber.datatable.DataTable d) {
	   List<List<String>> asLists = d.asLists(String.class);
	   driver.findElement(By.id("email")).sendKeys(asLists.get(0).get(0));
	   driver.findElement(By.id("pass")).sendKeys(asLists.get(1).get(3));
	   
	   driver.findElement(By.id("loginbutton")).click();
	   
	}

	@Then("user enters the homepage")
	public void user_enters_the_homepage() {
	    System.out.println("user enter the homepage");
	}


}
