package ChromeTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class matrixLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/driver/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get("https://");
		 
		//login
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
				
		
		//add Likert
		driver.findElement(By.xpath("//div[contains(@class, 'question-type--matrix')]")).click();
		
		
			for (int a=0; a<=5; a++) {
				
				driver.findElement(By.xpath("//input[@id='answers" + a + ".value']")).sendKeys("Answer " + a + Keys.ENTER);
					}
			
			driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		
		
		
	}

}
