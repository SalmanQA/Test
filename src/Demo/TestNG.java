package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

public class TestNG {

	public WebDriver driver;

  @Test

  public void main() {

	// Find the element that's ID attribute is 'account'(My Account)

      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/section/div/div/a")).click();

      // Find the element that's ID attribute is 'log' (Username)

      // Enter Username on the element found by above desc.

      driver.findElement(By.id("btn_basic_example")).click();

      // Find the element that's ID attribute is 'pwd' (Password)

      // Enter Password on the element found by the above desc.

      driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[2]/div/a[1]")).click();

      // Now submit the form. WebDriver will find the form for us from the element
      driver.findElement(By.id("user-message")).sendKeys("hi,Frndz");
      
  }

  @BeforeMethod

  public void beforeMethod() {

	  // Create a new instance of the Firefox driver

      driver = new FirefoxDriver();

      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //Launch the Online Store Website

      driver.get("http://www.seleniumeasy.com/selenium-tutorials");

  }

  @AfterMethod

  public void afterMethod() {

	  // Close the driver

      driver.quit();

  }

}