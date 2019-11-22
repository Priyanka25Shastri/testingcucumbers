package ccasestudy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Case1
{
	WebDriver driver;
	@Given("the signup page is opened")
	public void the_signup_page_is_opened() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\p.suresh.shastri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	    driver.get(url);
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters Priyanka as username")
	public void user_enters_Priyanka_as_username() 
	{
	    driver.findElement(By.id("userName")).sendKeys("Priyanka");
	}

	@When("user enters First name")
	public void user_enters_First_name() 
	{
	    driver.findElement(By.name("firstName")).sendKeys("Priyanka");
	}

	@When("user enters Last name")
	public void user_enters_Last_name() 
	{
	    driver.findElement(By.name("lastName")).sendKeys("Shastri");
	}

	@When("enters Priyanka{int} as password")
	public void enters_Priyanka_as_password(Integer int1) 
	{
	    driver.findElement(By.name("password")).sendKeys("Priyanka25");
	}

	@When("enters Priyanka{int} as password for confirmation")
	public void enters_Priyanka_as_password_for_confirmation(Integer int1) 
	{
	    driver.findElement(By.name("confirmPassword")).sendKeys("Priyanka25");
	}

	@When("Select gender as female")
	public void select_gender_as_female() 
	{
	    driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("enters pshastri{int}@gmail.com as email id")
	public void enters_pshastri_gmail_com_as_email_id(Integer int1) 
	{
	    driver.findElement(By.name("emailAddress")).sendKeys("pshastri32@gmail.com");
	}

	@When("user enters {string} as phone number")
	public void user_enters_as_phone_number(String string)
	{
		driver.findElement(By.id("mobileNumber")).sendKeys("8197283292");
	}

	@When("Selects {string} as his date of birth")
	public void selects_as_his_date_of_birth(String string)
	{
	    driver.findElement(By.name("dob")).sendKeys("25/09/1995");
	}

	@When("enters {string} as address")
	public void enters_as_address(String string)
	{
	    driver.findElement(By.id("address")).sendKeys("abcdefghijk");
	}

	@When("selects security question as birth place")
	public void selects_security_question_as_birth_place() 
	{
		Select catgDropDown=new Select(driver.findElement(By.id("securityQuestion")));
		catgDropDown.selectByIndex(0);
	}

	@When("answers as Sirsi")
	public void answers_as_Sirsi() 
	{
	    driver.findElement(By.name("answer")).sendKeys("Sirsi");
	}

	@When("Clicks on register")
	public void clicks_on_register()
	{
	    driver.findElement(By.xpath("//input[@type='submit']"));
	}

	@Then("User is navigated to Login Page")
	public void user_is_navigated_to_Login_Page() 
	{
	    System.out.println("Output");
	}
}
