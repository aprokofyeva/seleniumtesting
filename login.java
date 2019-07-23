package ChromeTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//login page
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("password");
		driver.findElement(By.cssSelector(".login-page__form__login-button")).click();
		
		//click to go to surveys page
		driver.findElement(By.xpath("//a[@href='/admin/surveys/']")).click();
		
		//create new survey
		driver.findElement(By.xpath("//button[@id='createSurveyButton']")).click();
		driver.findElement(By.xpath("//div[@id='create-survey-popup__next']")).click();
		
		//name a survey
		driver.findElement(By.xpath("//input[@id='surveyName']")).clear();
		driver.findElement(By.xpath("//input[@id='surveyName']")).sendKeys("automationSurveyName");
		driver.findElement(By.xpath("//div[@id='create-survey-popup__next']")).click();
		
		//select all q
		driver.findElement(By.cssSelector(".add-questions__question-types__question-type--multiple_choice")).click();
		
		//wait and select
		
		//add mc many
		driver.findElement(By.cssSelector("#question-title-content > div.ql-editor.ql-blank")).sendKeys("MC text");
		driver.findElement(By.xpath("//input[@id='answers0.value']")).sendKeys("answer1");
		driver.findElement(By.xpath("//input[@id='answers1.value']")).sendKeys("answer2");
		driver.findElement(By.xpath("//div[@class='save-button__container']")).click();
		//Thread.sleep(5000L);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//add date picker
		//WebDriver wait = new WebDriverWait(login.driver, 10);
		//WebElement datePicker = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".add-questions__question-types__question-type--date > div:nth-child(2)")));
		//datePicker.click();
		//driver.findElement(By.cssSelector(".add-questions__question-types__question-type--date > div:nth-child(2)")).click();
		//WebElement datePicker = driver.findElement(By.xpath("//div[@class='add-questions__question-types__question-type add-questions__question-types__question-type--date']"));
		//if (datePicker.isDisplayed() && datePicker.isEnabled()) {
		//	datePicker.click();
		driver.findElement(By.cssSelector(".add-questions__question-types__question-type--date")).click();
		driver.findElement(By.cssSelector(".ql-editor")).sendKeys("Date Picker Question");
		driver.findElement(By.xpath("//input[@id='minDate']")).click();
		while(!driver.findElement(By.xpath("//th[@class='month']")).getText().contains("August"))
		{
			driver.findElement(By.cssSelector(".show-calendar > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)")).click();
		}
		
		
		
		
		}
		
		
		
		
		
		
		
		//Actions builder = new Actions(driver);
		//builder.moveToElement(qtc).perform();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//qtc.sendKeys("MC text");
		
		
		
		
		
		
		
	
		
	}

}
