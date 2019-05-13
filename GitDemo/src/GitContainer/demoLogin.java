package GitContainer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class demoLogin {
	
	WebDriver driver;
	
  @Test
  public void f() {
	   
		driver.findElement(By.name("Email")).sendKeys("mshubham@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("shubham");
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\shubham\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
