package seleniumsessionsnaveenautomachine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcepts {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		
	}
	static void launchBrowser1()
	{
		
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
}
