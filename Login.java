package vTigerIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
@Test
public void validlogin(){
	System.out.println("Hello");
	
	System.setProperty("webdriver.gecko.driver","F:\\SELENIUM\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

	    driver .get("http://localhost:100/");
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin"); 
	    driver.findElement(By.name("login_theme")).sendKeys("blue");
	    driver.findElement(By.name("Login")).click();
	    System.out.println("Login successfully");
	    driver.findElement(By.name("Log out")).click();
	    System.out.println("logout successfully");
}
}
