package com.masteringselenium.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasicTest {
	
	
	
    private ExpectedCondition<Boolean> pageTitleStartsWith(final String searchString) {
    	
    	System.out.println("started step15");
		
    //    return driver -> driver.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
  // String Title=driver.getTitle().toLowerCase();
 //  boolean Value=Title.startsWith(searchString.toLowerCase());
		  return driver -> driver.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
		    
 
 
 //  return Value;
    
    }

    private void googleExampleThatSearchesFor(final String searchString) {
    	
    	System.out.println("started step3");

    	WebDriver driver = new FirefoxDriver();
    	System.setProperty("webdriver.gecko.driver", "G:\\webdriver\\geckodriver.exe");

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));

        searchField.clear();
        searchField.sendKeys(searchString);

        System.out.println("Page title is: " + driver.getTitle());

        searchField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10, 100);
        System.out.println("started step14");
        wait.until(pageTitleStartsWith(searchString));
        System.out.println("started step16");

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
    @Test
    public void googleCheeseExample() {
    	System.out.println("started step1");
        googleExampleThatSearchesFor("Cheese!");
    }
    @Test
    public void googleMilkExample() {
    	System.out.println("started step2");
        googleExampleThatSearchesFor("Milk!");
    }
}



