package ccasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class case2 
{
	WebDriver driver;
	@Given("User should open the application")
	public void user_should_open_the_application() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\p.suresh.shastri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	    driver.get(url);
	}

	@When("User should click on the login link")
	public void user_should_click_on_the_login_link()
	{
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String password) 
	{
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		//driver.close();
	}

	@Then("Message displayed login successfully")
	public void message_displayed_login_successfully() 
	{
		System.out.println("Logged in successfully");
	}
	
}
