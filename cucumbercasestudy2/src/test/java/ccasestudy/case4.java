package ccasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class case4 
{
	WebDriver driver;
	boolean cartAvailable;
	@Given("Alex has registered to TestMeApp")
	public void alex_has_registered_to_TestMeApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\p.suresh.shastri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    String url="http://10.232.237.143:443/TestMeApp/login.htm";
	    driver.get(url);
	    //driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.id("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("password123");
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("Alex searches a particular product like headphones")
	public void alex_searches_a_particular_product_like_headphones() 
	{
	    driver.findElement(By.name("products")).sendKeys("Head");
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("Try to proceed to payment without adding any element to the cart")
	public void try_to_proceed_to_payment_without_adding_any_element_to_the_cart() 
	{
	   String cart="Cart";
	   try
	   {
		   WebElement element=driver.findElement(By.partialLinkText(cart));
			element.click();
			cartAvailable=true;
	   }
	   catch(org.openqa.selenium.NoSuchElementException|StaleElementReferenceException e)
	   {
		   e.printStackTrace();
	   }
	}

	@Then("Test me doesn't display the cart icon")
	public void test_me_doesn_t_display_the_cart_icon() 
	{
	    Assert.assertTrue(!cartAvailable);
	}
}
