package com.itexps.bddFeb13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	private static WebDriver driver;
    private String baseUrl;  

    @Given("a web browser is on the Google page")
    public void a_web_browser_is_on_the_google_page() {
    	System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl="https://www.google.com/";
        driver.get(baseUrl);
    }

    @When("the search phrase {string} is entered")
    public void the_search_phrase_is_entered(String searchdata) {
    	driver.findElement(By.name("q")).clear();
	    driver.findElement(By.name("q")).sendKeys( searchdata);
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   Assert.assertEquals(searchdata +" - Google Search", driver.getTitle());
    }
    @Then("results are shown")
    public void results_are_shown() {
        driver.quit();
    }

  
}
