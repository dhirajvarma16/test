package cucumber_Prudential_test.Prudential_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ValidCitySearch {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	@Given("^User navigates to openweathermap website$")
	public void user_navigates_to_openweathermap_website() throws Throwable{
		System.setProperty("webdriver.chrome.driver","/Users/naveenkhunteta/Downloads/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.freecrm.com/index.html");

	}
	
	@When("^page loaded completely and user validates homepage title$")	
	public void user_pageTitle() throws Throwable{
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	}
	@Then("^User enters valid city name$")
	public void Invalid_search() {
       driver.findElement(By.xpath("//*[@id='q']")).sendKeys(" Mumbai, IN");
	   driver.findElement(By.xpath("//*[@id='searchform']/button")).click();
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='col-sm-12'])[3]")));
	String getText= driver.findElement(By.xpath("//*[@id='forecast_list_ul']/table/tbody/tr/td[2]/b[1]/a")).getText();
	   Assert.assertEquals(getText, " Mumbai, IN");
	}

}
