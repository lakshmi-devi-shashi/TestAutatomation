package seleniumsessionsnaveenautomachine;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopsHandlerDemo {


	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupTesting();	
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popupTesting()
	{
		try
		{
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(1000);
			Set<String> handler =	oBrowser.getWindowHandles();
			Iterator<String> it=handler.iterator();
			String parentWindow= it.next();
			System.out.println("the parent window text:"+parentWindow.toString());
			Thread.sleep(1000);

			String childWindow=it.next();
			System.out.println("the chid window text:"+childWindow.toString());

			oBrowser.switchTo().window(childWindow);
			Thread.sleep(1000);

			System.out.println("the child window text is:"+oBrowser.getTitle());
			Thread.sleep(1000);

			oBrowser.close();

			oBrowser.switchTo().window(parentWindow);
			System.out.println("the parent window text:"+oBrowser.getCurrentUrl());

			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
