package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 2. LaunchBrowser--> navigate --> login as admin --> create user1 --> logout --> login as user1 
 * --> create user2 --> logout --> login as user2 --> create user3 --> logout-->login as admin --> modify user1
 *  --> logout --> login as user1 --> modify user2 --> logout -->login as user2 --> modify user3 --> logout -->login as user2 --> delete user3 --> logout
 *  --> login as user1 --> delete user2 --> logout --> login as admin --> delete user1 --> logout --> close application
 */
public class AdvanceAssignmentQa2 {
	public static WebDriver oBrowser=null;
	public static WebElement webele= null;


	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		loginasAdmin();
		flyoutWindowMinimize();
		createUser1();
		
		

	}
	static void launchBrowser()
	{
		String path=null;
		
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasAdmin()
	{
		
		try
		{
			webele=oBrowser.findElement(By.name("username"));
			webele.sendKeys("admin");
			webele=oBrowser.findElement(By.name("pwd"));
			webele.sendKeys("manager");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.xpath("//*[@id='loginButton']/div"));
			webele.click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void flyoutWindowMinimize()
	{
		try
		{
			webele=oBrowser.findElement(By.id("gettingStartedShortcutsPanelId"));
			webele.click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser1()
	{
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
