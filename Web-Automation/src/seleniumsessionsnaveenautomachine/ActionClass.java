package seleniumsessionsnaveenautomachine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mouseOver();

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
			oBrowser.get("https://book.spicejet.com/");//navigate the spicejet
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void mouseOver()
	{
		try {
			Actions action = new Actions(oBrowser);
			action.moveToElement(oBrowser.findElement(By.linkText("ADD-ONS"))).build().perform();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
