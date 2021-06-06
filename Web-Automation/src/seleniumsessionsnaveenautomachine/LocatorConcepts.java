package seleniumsessionsnaveenautomachine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcepts {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {

		launchBrowser();
		navigate();
		registerationForm();
		dropdownFinction();

	}
	
	static void launchBrowser()
	{
		String path=null;//path should be declared as null
		try
		{
			path=System.getProperty("user.dir");//user directory
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");//chrome.exe driver path
			System.out.println(path);
			oBrowser=new ChromeDriver();//lanch chrome
			oBrowser.manage().window().maximize();//maximize the chrome window
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.facebook.com/r.php");//navigate the facebook regestration page
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void registerationForm()
	{
		try
		{
			oBrowser.findElement(By.name("firstname")).sendKeys("lakshmidevi");
			oBrowser.findElement(By.name("lastname")).sendKeys("devi");
			oBrowser.findElement(By.name("reg_email__")).sendKeys("lakshmidevi0660@gmail.com");
			oBrowser.findElement(By.name("reg_email_confirmation__")).sendKeys("lakshmidevi0660@gmail.com");
			oBrowser.findElement(By.id("password_step_input")).sendKeys("Shka@123");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void dropdownFinction()
	{
		try
		{
			Select select= new Select(oBrowser.findElement(By.id("day")));//create the object for dropdown to click
			select.selectByVisibleText("17");//to visible the text after cliking the dropdown
			Select select1= new Select(oBrowser.findElement(By.id("month")));
			select1.selectByVisibleText("Jul");
			Select select2= new Select(oBrowser.findElement(By.id("year")));
			select2.selectByVisibleText("1994");
			oBrowser.findElement(By.className("_58mt")).click();
			//oBrowser.findElement(By.linkText("Terms")).click();
			oBrowser.findElement(By.name("websubmit")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
