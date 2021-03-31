package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonSearchSteps {


	WebDriver driver;

	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser()
	{
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
	}


	@When("I Open Amazon Home Page")
	public void i_Open_Amazon_Home_Page() {
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}


	@When("Search for mobile")
	public void search_for_mobile()
	{
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//span[@id= 'nav-search-submit-text']/input[@type= 'submit']")).click();
	}

	@Then("Search results for mobile should be displayed")
	public void search_results_for_mobile_should_be_displayed()
	{
		List<WebElement> searchResults = driver.findElements(By.xpath("//span[contains(text(), 'Samsung')]"));
		if (searchResults.size()!=0)
		{
			System.out.println("Test is pass and search results for mobile is displyed");
		}

		else
		{
			System.out.println("Test is fail and search results for mobile is not displyed");
		}
	}
}
