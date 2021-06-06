package com.sgtesting.pom;
/*
 * 1). lanchBrowser --> navigate --> login --> createUser --> deleteUser --> logout --> closeApplication
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAssignmentQa1 {

	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser();
		deleteuser();
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiTimePages(oBrowser);
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void flyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			oPage.getuserButton().click();
			oPage.getAdduserButton().click();
			Thread.sleep(1000);
			oPage.getFirstName().sendKeys("User");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("demo");
			Thread.sleep(1000);
			oPage.getemailId().sendKeys("userdemo@gmail.com");
			Thread.sleep(1000);
			oPage.getLonginDetails().sendKeys("user1");
			Thread.sleep(1000);
			oPage.getpasswords().sendKeys("1234");
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys("1234");
			Thread.sleep(1000);
			oPage.getCreateUserButton().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser()
	{
		try
		{
			oPage.getuserButton().click();
			oPage.getuserNameContainer().click();
			Thread.sleep(1000);
			oPage.getDeleteButton().click();
			Thread.sleep(1000);
			
			
			Alert alert=oBrowser.switchTo().alert();
			String content=alert.getText();
			System.out.println(content);
			alert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
