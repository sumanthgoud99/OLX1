package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Base_Test;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MotorCycles extends Base_Test{
	@When("user clicks on motorcycles icon")
	public void user_clicks_on_motorcycles_icon() throws Throwable {
		//WebDriver driver = null;
		//WebDriver driver;
	    //System.setProperty("CHROME_KEY", "CHROME_PATH");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\suman\\OneDrive\\Documents\\Installables\\chromedriver.exe");
	    driver=new ChromeDriver ();
	    driver.get(getValueProperty("URL"));
	    
	    driver.findElement(By.xpath("//span[text()='Motorcycles']")).click();
	}

	@Then("motorcycles page should be displayed")
	public void motorcycles_page_should_be_displayed() {
		String title=driver.getTitle();
		if(title.contains("motorcycles_c81"))
		{
			System.out.println("page is displayed");
		}
		else {
			System.out.println("page is not displayed");
		}
	}


}
