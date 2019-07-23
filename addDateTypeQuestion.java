package ChromeTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class addDateTypeQuestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//login page
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("");
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
		
		//add datePicker
		/*driver.findElement(By.cssSelector(".add-questions__question-types__question-type--date")).click();
		driver.findElement(By.cssSelector(".ql-editor")).sendKeys("Date Picker Question");
		driver.findElement(By.xpath("//input[@id='minDate']")).click();
		while(!driver.findElement(By.xpath("//th[@class='month']")).getText().contains("August"))
		{
			driver.findElement(By.xpath("/html/body/div[6]/div/form/div[2]/div[1]/div[2]/div/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
		}
	    
		//find date by xpath
		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='available']"));
		int count = driver.findElements(By.xpath("//td[@class='available']")).size();
		for (int i =0; i<count; i++) 
		{
			String text = driver.findElements(By.className("available")).get(i).getText();
			if(text.equalsIgnoreCase("6"))
			{
				driver.findElements(By.className("available")).get(i).click();
				break;
			}
			
		}
		//thread.sleep(3000);
		//max date window
		driver.findElement(By.xpath("//input[@id='maxDate']")).sendKeys("09/08/2018");
		//save question
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(3000);
		*/
		//add list picker
		driver.findElement(By.xpath("//div[contains(@class, 'list_picker')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("List Picker");
		driver.findElement(By.xpath("//textarea[@id='answerItems']")).sendKeys("Answer1" + Keys.ENTER + "Answer2" + Keys.ENTER + "Answer3");
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(3000);
		
		//add Two Choices
		driver.findElement(By.xpath("//div[contains(@class, 'two_choice')]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/form/div[2]/div[2]/label[2]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(2000);
		
		//add MC question
		driver.findElement(By.xpath("//div[contains(@class,'multiple_choice')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("MC many");
		driver.findElement(By.xpath("//input[@id='answers0.value']")).sendKeys("Answer1" + Keys.TAB + "Answer2");
		driver.findElement(By.xpath("//button[@class='blue base hel-m add-answer-button']")).click();
		driver.findElement(By.xpath("//input[@id='answers2.value']")).sendKeys("Answer3");
		//driver.findElement(By.xpath("//span[@class='onoffswitch-inner']")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(2000);
		
		//add rank
		driver.findElement(By.xpath("//div[contains(@class, 'rank')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Rank");
		driver.findElement(By.xpath("//input[@id='answers0.value']")).sendKeys("Answer1" + Keys.TAB + "Answer2");
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Likert
		driver.findElement(By.xpath("//div[contains(@class, 'question-type--matrix')]")).click();
			for (int a=0; a<=5; a++) {
				driver.findElement(By.xpath("//input[@id='answers" + a + ".value']")).sendKeys("Answer " + a + Keys.ENTER);
			}
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Text Input
		driver.findElement(By.xpath("//div[contains(@class, 'text_input')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt justo risus, ac convallis nisl euismod eu. Curabitur viverra orci ac urna convallis vulputate. Aliquam tincidunt sollicitudin sapien, ut vehicula neque facilisis ac. Aliquam hendrerit mollis magna. Pellentesque ut massa lacinia, accumsan lectus a, consectetur augue. Duis id enim id justo aliquet tincidunt. Sed commodo justo vel aliquam sagittis. Praesent sagittis ut arcu id egestas. Sed nunc lectus, feugiat quis felis bibendum amet.");
		//driver.findElement(By.xpath("//span[@class='onoffswitch-switch']")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		
		//add Number
		driver.findElement(By.xpath("//div[contains(@class, 'number')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Email
		driver.findElement(By.xpath("//div[contains(@class, 'email')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Telephone
		driver.findElement(By.xpath("//div[contains(@class, 'question-type--telephone')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Postal Code
		driver.findElement(By.xpath("//div[contains(@class, 'zip_code')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Website
		driver.findElement(By.xpath("//div[contains(@class, 'website_url')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Slide
		driver.findElement(By.xpath("//div[contains(@class, 'sliding_scale')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("SLiding Scale");
		driver.findElement(By.xpath("//textarea[@id='answerItems']")).sendKeys("1" + Keys.ENTER + "2" + Keys.ENTER + "3" + Keys.ENTER + "4" + Keys.ENTER + "5" + Keys.ENTER + "6" + Keys.ENTER + "6");
		driver.findElement(By.xpath("//div[@class='save-button__container']")).click();
		Thread.sleep(1000);
		
		//add Star Rating
		driver.findElement(By.xpath("//div[contains(@class, 'star_rating')]")).click();
		driver.findElement(By.xpath("//label[@for='starOptions8']")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Satisfaction Rating
		driver.findElement(By.xpath("//div[contains(@class, 'satisfaction_rating')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(2000);
		
		//add NPS
		driver.findElement(By.xpath("//div[contains(@class, 'nps')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Display Text
		driver.findElement(By.xpath("//div[contains(@class, 'display_text')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt justo risus, ac convallis nisl euismod eu. Curabitur viverra orci ac urna convallis vulputate. Aliquam tincidunt sollicitudin sapien, ut vehicula neque facilisis ac. Aliquam hendrerit mollis magna. Pellentesque ut massa lacinia, accumsan lectus a, consectetur augue. Duis id enim id justo aliquet tincidunt. Sed commodo justo vel aliquam sagittis. Praesent sagittis ut arcu id egestas. Sed nunc lectus, feugiat quis felis bibendum amet.");
		driver.findElement(By.xpath("//input[@id='continueButtonText']")).sendKeys("Button Text");
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Location
		driver.findElement(By.xpath("//div[contains(@class, 'location')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Photo
		driver.findElement(By.xpath("//div[contains(@class, 'camera')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add QR
		driver.findElement(By.xpath("//div[contains(@class, 'qr_barcode')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Signature
		driver.findElement(By.xpath("//div[contains(@class, 'signature')]")).click();
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add Terms
		driver.findElement(By.xpath("//div[contains(@class, 'terms_and_conditions')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Terms & Conditions");
		driver.findElement(By.xpath("//textarea[@id='termsText']")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tincidunt justo risus, ac convallis nisl euismod eu. Curabitur viverra orci ac urna convallis vulputate. Aliquam tincidunt sollicitudin sapien, ut vehicula neque facilisis ac. Aliquam hendrerit mollis magna. Pellentesque ut massa lacinia, accumsan lectus a, consectetur augue. Duis id enim id justo aliquet tincidunt. Sed commodo justo vel aliquam sagittis. Praesent sagittis ut arcu id egestas. Sed nunc lectus, feugiat quis felis bibendum amet.");
		driver.findElement(By.xpath("//input[@id='answers0.value']")).sendKeys("Answer 1" + Keys.ENTER);
		//driver.findElement(By.xpath("//button[@class='blue base hel-m add-answer-button']")).click();
		driver.findElement(By.xpath("//input[@id='answers1.value']")).sendKeys("Answer 2");
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(1000);
		
		//add StopWatch
		driver.findElement(By.xpath("//div[contains(@class, 'stop_watch')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Stop Watch");
		driver.findElement(By.xpath("//div[@id='add-question-save']")).click();
		Thread.sleep(3000);
		
		//customize
		driver.findElement(By.xpath("//div[contains(@class, 'customize-tab')]")).click();
		driver.findElement(By.xpath("//img[@class='sprite sprite-light-grey-chalkboard']")).click();
		Thread.sleep(1000);
		
		//settings
		driver.findElement(By.xpath("//div[contains(@class, 'settings-tab')]")).click();
		for(int i = 0; i <= 2; i++) {
			driver.findElement(By.xpath("//input[@id='responseFilters" + i +"']")).sendKeys("Response Filters " + i);
			driver.findElement(By.xpath("//button[@id='response-filter__add']")).click();
			
		}
		
		//exit code
		driver.findElement(By.xpath("//input[@id='exitCode']")).sendKeys("1");
		
		//timeout
		driver.findElement(By.xpath("//input[@id='timeout']")).sendKeys("12");
		
		//publish survey
		driver.findElement(By.xpath("//div[contains(@class, 'publish-button')]")).click();
		
		
		
		
		
		//driver.close();
		
		
		
		
		
		
		
		
	}

}
