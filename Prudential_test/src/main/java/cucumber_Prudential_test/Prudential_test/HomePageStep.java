package cucumber_Prudential_test.Prudential_test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class HomePageStep {
	List<String> navBar= new ArrayList<String>();
	List<String> navBar2= new ArrayList<String>();
	List<String> navBar3= new ArrayList<String>();
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,20);
	@Given("^User navigates to openweathermap website$")
	public void user_navigates_to_openweathermap_website() throws Throwable{
		System.setProperty("webdriver.chrome.driver","F:\\stuff\\Chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://openweathermap.org/");

	}
	
	@When("^page loaded completely user validates homepage title$")	
	public void user_pageTitle() throws Throwable{
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Сurrent weather and forecast - OpenWeatherMap", title);
	}
	
	@Then("^User perform all the activities$")
	public void user_activities() throws Throwable{
		boolean supportcenterisvisible= driver.findElement(By.xpath("//span[@class='hidden-xs']")).isDisplayed();
		Assert.assertEquals(supportcenterisvisible, true);
		
		boolean searchbuttonIsVisibel=driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).isDisplayed();
		Assert.assertEquals(searchbuttonIsVisibel, true);
		
		boolean signupIsVisible=driver.findElement(By.xpath("(//a[@class='pull-right'])[1]")).isDisplayed();
		Assert.assertEquals(signupIsVisible, true);
		
		
		String signtext=driver.findElement(By.xpath("(//a[@class='pull-right'])[1]")).getText();
		Assert.assertEquals(signtext, " Sign Up");
		
		boolean signInIsVisible=driver.findElement(By.xpath("(//a[@class='pull-right'])[2]")).isDisplayed();
		Assert.assertEquals(signInIsVisible, true);
		
		
		String signIntext=driver.findElement(By.xpath("(//a[@class='pull-right'])[2]")).getText();
		Assert.assertEquals(signIntext, "  Sign In");
		
		boolean navbar2= driver.findElement(By.xpath("(//div[@class='navbar navbar-dark navbar-static-top'])")).isDisplayed();
		Assert.assertEquals(navbar2, true);
		
		
		List<WebElement> count=driver.findElements(By.xpath("(//ul[@class='nav navbar-nav navbar-right'])/li[@class='nav__item']/a"));
		Assert.assertEquals(count.size(), 8);
		
		for(WebElement ele : count)
        {
			navBar.add(ele.getText());
        }
		
      for (int i = 0; i < navBar.size(); i++) {
    		
    		if(navBar.get(i).equalsIgnoreCase("Weather")) {
    			Assert.assertEquals(navBar.get(i), "Weather");    		  			  			
    		}
    		else if(navBar.get(i).equalsIgnoreCase("Guide")) {
    			Assert.assertEquals(navBar.get(i), "Guide");    		
    		}
    		else if(navBar.get(i).equalsIgnoreCase("API")) {
    			Assert.assertEquals(navBar.get(i), "API");
    		}
    		else if(navBar.get(i).equalsIgnoreCase("Price")) {
    			Assert.assertEquals(navBar.get(i), "Price");    		
    		}
    		else if(navBar.get(i).equalsIgnoreCase("Partners")) {
    			Assert.assertEquals(navBar.get(i), "Partners");    		
    		}
    		else if(navBar.get(i).equalsIgnoreCase("Stations")) {
    			Assert.assertEquals(navBar.get(i), "Stations");    		
    		}
    		else if(navBar.get(i).equalsIgnoreCase("Widgets")) {
    			Assert.assertEquals(navBar.get(i), "Widgets");    		
    		}
    		else if(navBar.get(i).equalsIgnoreCase("                Blog\r\n" + 
    				"")) {
    			Assert.assertEquals(navBar.get(i), "                Blog\r\n" + 
    					"");    		
    		} 
    	}
      
      String jmbo_title=driver.findElement(By.xpath("//div[@class='col-sm-12']/h2[@class='jumbotron__title']")).getText();
      Assert.assertEquals(jmbo_title, "2,000 new subscribers a day | 1,700,000 customers | 20+ weather APIs");
      
      boolean searchCity=driver.findElement(By.xpath("//div[@class='form-group search-cities__block']")).isDisplayed();
      Assert.assertEquals(searchCity, true);
      
      boolean searchButton=driver.findElement(By.xpath("//button[@class='btn btn-orange']")).isDisplayed();
      Assert.assertEquals(searchButton, true);
      
      String str2=driver.findElement(By.xpath("//h2[@class='widget__title']")).getText();
      Assert.assertEquals(str2, "Current weather and forecasts in your city");
      
      List<WebElement> count1=driver.findElements(By.xpath("(//ul[@class='widget-tabs']/li[@class='widget-tabs__item']/a"));
		Assert.assertEquals(count1.size(), 5);
		
		for(WebElement ele : count)
      {
			navBar2.add(ele.getText());
      }
		
    for (int i = 0; i < navBar2.size(); i++) {
  		
  		if(navBar2.get(i).equalsIgnoreCase(" Main")) {
  			Assert.assertEquals(navBar.get(i), " Main");		
  			driver.findElement(By.xpath("(//ul[@class='widget-tabs']/li[@class='widget-tabs__item']/a)[1]")).click();
  			String mainText=driver.findElement(By.xpath("//div[@class='weather-forecast-hourly-graphic']/h2[@class='weather-forecast-hourly-graphic__header']")).getText();
  			Assert.assertEquals(mainText, "Weather and forecasts in London, GB"); 			
  			
  	        boolean sectionDisplayed=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-container ']"))).isDisplayed();
  			Assert.assertEquals(sectionDisplayed, true);
  			
  		}
  		else if(navBar.get(i).equalsIgnoreCase(" Daily")) {
  			Assert.assertEquals(navBar.get(i), " Daily");
  			driver.findElement(By.xpath("(//ul[@class='widget-tabs']/li[@class='widget-tabs__item']/a)[2]")).click();
  			String mainText=driver.findElement(By.xpath("//div[@class='weather-forecast-graphic__header']/h2[@class='weather-forecast-graphic__header']")).getText();
  			Assert.assertEquals(mainText, "Daily weather and forecasts in London, GB"); 
  			
  			boolean sectionDisplayed=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-container ']"))).isDisplayed();
  			Assert.assertEquals(sectionDisplayed, true);
  		}
  		
  		else if(navBar.get(i).equalsIgnoreCase(" Hourly")) {
  			Assert.assertEquals(navBar.get(i), " Hourly");
  			driver.findElement(By.xpath("(//ul[@class='widget-tabs']/li[@class='widget-tabs__item']/a)[3]")).click();
  			String mainText=driver.findElement(By.xpath("//div[@class='weather-forecast-graphic__header']/h2[@class='weather-forecast-hourly-list__header']")).getText();
  			Assert.assertEquals(mainText, "Hourly weather and forecasts in London, GB"); 
  			
  		
  			boolean sectionDisplayed=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='widget']/div/div/div[3]/div[3]/span/span/div/table"))).isDisplayed();
  			Assert.assertEquals(sectionDisplayed, true);

  		}
  		else if(navBar.get(i).equalsIgnoreCase(" Chart")) {
  			Assert.assertEquals(navBar.get(i), " Chart");
  			driver.findElement(By.xpath("(//ul[@class='widget-tabs']/li[@class='widget-tabs__item']/a)[4]")).click();
  			String mainText=driver.findElement(By.xpath("//div[@class='weather-forecast-graphic__header']/h2[@class='weather-forecast-chartval-graphic__header']")).getText();
  			Assert.assertEquals(mainText, "Chart weather and forecasts in London, GB");
  			
  			boolean sectionDisplayed=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='widget']/div/div/div[3]/div[3]/span/span/div/ul"))).isDisplayed();
  			Assert.assertEquals(sectionDisplayed, true);
  			
  			List<WebElement> count3=driver.findElements(By.xpath("//*[@id='widget']/div/div/div[3]/div[3]/span/span/div/ul/li"));
  			Assert.assertEquals(count3.size(), 4);
  			
  			for(WebElement ele : count3)
  	        {
  				navBar3.add(ele.getText());
  	        }
  			 for (int j = 0; j < navBar3.size(); j++) {
  		  		
  		  		if(navBar3.get(j).equalsIgnoreCase(" Temperature")) {
  		  			driver.findElement(By.xpath("//*[@id='widget']/div/div/div[3]/div[3]/span/span/div/ul/li[1]/a")).click();
  		  			
  		  		boolean sectionDisplayed2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-container ']"))).isDisplayed();
  	  			Assert.assertEquals(sectionDisplayed2, true);  		  			
  		  		}
  		  		else if(navBar3.get(j).equalsIgnoreCase(" Wind")) {
  		  			driver.findElement(By.xpath("//*[@id='widget']/div/div/div[3]/div[3]/span/span/div/ul/li[2]/a")).click();  		  			
  		  		boolean sectionDisplayed2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-container ']"))).isDisplayed();
  	  			Assert.assertEquals(sectionDisplayed2, true);  		  			
  		  		}
  		  	    else if(navBar3.get(j).equalsIgnoreCase(" Pressure")) {
		  			driver.findElement(By.xpath("//*[@id='widget']/div/div/div[3]/div[3]/span/span/div/ul/li[3]/a")).click();  		  			
		  		boolean sectionDisplayed2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-container ']"))).isDisplayed();
	  			Assert.assertEquals(sectionDisplayed2, true);  		  			
		  		}
  		  	   else if(navBar3.get(j).equalsIgnoreCase(" Precipitation")) {
	  			driver.findElement(By.xpath("//*[@id='widget']/div/div/div[3]/div[3]/span/span/div/ul/li[4]/a")).click();  		  			
	  		     boolean sectionDisplayed2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-container ']"))).isDisplayed();
  			     Assert.assertEquals(sectionDisplayed2, true);  		  			
	  		}
  		  		
  		  		
  		  		
  		  		}
  			
  			
  		}
  		else if(navBar.get(i).equalsIgnoreCase("  Map")) {
  			Assert.assertEquals(navBar.get(i), "  Map");
  			driver.findElement(By.xpath("(//ul[@class='widget-tabs']/li[@class='widget-tabs__item']/a)[5]")).click();
  			String mainText=driver.findElement(By.xpath("//div[@class='weather-forecast-graphic__header']/h2[@class='weather-map-layers__header']")).getText();
  			Assert.assertEquals(mainText, "Map weather and forecasts in  London, GB");
  			
  			boolean sectionDisplayed=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-container ']"))).isDisplayed();
  			Assert.assertEquals(sectionDisplayed, true);
  			
  		}
  		
  	}

		
		
	}
	@Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
}
