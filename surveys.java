package ChromeTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class surveys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://");
		
		//login page
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("user@test.com");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("password");
		driver.findElement(By.cssSelector(".login-page__form__login-button")).click();
		Thread.sleep(1000);
				
		//go to Account
		driver.findElement(By.xpath("//button[contains(@class, 'dropDownButton2')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/admin/account/']")).click();
		
		//go to Subscription
		driver.findElement(By.xpath("//a[@href='/admin/upgrade/']")).click();
		
		//select monthly Premium
		driver.findElement(By.xpath("//label[@for='billingFrequency1']")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/form/div[2]/div[1]/div")).click();
		driver.findElement(By.xpath("//input[@id='numDevices']")).clear();
		driver.findElement(By.xpath("//input[@id='numDevices']")).sendKeys("3");
		
		
			   int country = driver.findElements(By.xpath("//select[@id='countryId']")).size();
			    	  	if(country > 0 ) {
			    	  			driver.findElement(By.xpath("//select[@id='countryId']")).sendKeys("a");
			    	  			driver.findElement(By.xpath("//option[@value='1']")).click();
			    	  			driver.findElement(By.xpath("//button[@id='upgradeButton']")).click();
			    	  			 } // Success!
			    	  
			    	  	else{
			    	  		driver.findElement(By.xpath("//button[@id='upgradeButton']")).click();
			    	  	}
			 			
			  
		
}}
		
		
