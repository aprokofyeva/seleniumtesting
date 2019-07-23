package ChromeTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeDrNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ap/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://quicktapsurvey.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate to sign up
		driver.findElement(By.xpath("//div[@class='login-page__create-account-section__create-account-button']")).click(); 
					
		//fill out all fields
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("automation");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anna+automation@test.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("Company LTD");
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("0123456789");
		//accept terms
		driver.findElement(By.xpath("//input[@id='termsAndConditionsFlag']")).click();
		
		//I'm not a robot
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/form/div[6]/div/div/iframe")));
		driver.findElement(By.cssSelector("div.rc-anchor-logo-portrait")).click();
		//wait conditions
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(driver.findElement(By.cssSelector("div.rc-anchor-logo-portrait")).isSelected());
		  //IWebElement ClickElement = Wait.Until((d) => webDriver.FindElement(By.Id(parameter1)));
		  //ClickElement.Click();
		//driver.manage().timeouts().wait(10);
		Actions builder = new Actions(driver);
		
		WebElement qtc = driver.findElement(By.xpath("//button[@type='SUBMIT']"));
		builder.moveToElement(qtc).perform();
		WebDriverWait wait = new WebDriverWait(driver,15);
		//driver.findElement(By.cssSelector("div.rc-anchor-logo-portrait")).isSelected();
		//Thread.sleep(5000);
		
		
		//switch to default
		driver.switchTo().defaultContent();
		//click to submit
		driver.findElement(By.cssSelector(cssSelector)).click();
		
		
	    
		
				
		
		
		
	}

}
