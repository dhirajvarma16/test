package cucumber_Prudential_test.Prudential_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class InvalidCitySearch {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	@Given("^User navigates to openweathermap website$")
	public void user_navigates_to_openweathermap_website() throws Throwable{
		System.setProperty("webdriver.chrome.driver","F:\\stuff\\Chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://openweathermap.org/");

	}
	
	@When("^page loaded completely and user validates homepage title$")	
	public void user_pageTitle() throws Throwable{
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Сurrent weather and forecast - OpenWeatherMap", title);
	}
	@Then("^User enters invalid city name$")
	public void Invalid_search() {
       driver.findElement(By.xpath("//*[@id='q']")).sendKeys("abnck");
	   driver.findElement(By.xpath("//*[@id='searchform']/button")).click();
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='forecast_list_ul']/div")));
	String getText= driver.findElement(By.xpath("//*[@id='forecast_list_ul']/div")).getText();
	   Assert.assertEquals(getText, "Not found");
	}
	

}
