package ccasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class case3
{
	WebDriver driver;
	@Given("user logs in")
	public void user_logs_in() 
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

	@When("he enters search word head in search box")
	public void he_enters_search_word_head_in_search_box() 
	{
		driver.findElement(By.name("products")).sendKeys("Head");
	    
	}

	@When("clicks on find details")
	public void clicks_on_find_details() 
	{
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("clicks on add to cart,cart icon,checkout,proceed to pay")
	public void clicks_on_add_to_cart_cart_icon_checkout_proceed_to_pay() 
	{
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}

	@When("selects hdfc bank and clicks on continue")
	public void selects_hdfc_bank_and_clicks_on_continue() 
	{
		WebDriverWait Wait=new WebDriverWait(driver,10);
    	Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC Bank')]")));
		driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
    	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a")).click();
	}

	@When("enters username and password")
	public void enters_username_and_password()
	{
		driver.findElement(By.name("username")).sendKeys("123457");
    	driver.findElement(By.name("password")).sendKeys("Pass@457");
    	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

	@When("enters trans password")
	public void enters_trans_password()
	{
		driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
	}

	@Then("purchase the product")
	public void purchase_the_product() 
	{
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	}

}
