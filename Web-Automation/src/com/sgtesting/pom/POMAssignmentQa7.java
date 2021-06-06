package com.sgtesting.pom;
//7).lanchBrowser --> navigate --> login --> createCustomer --> createProject
//--> createTasks --> deleteTasks --> logout --> closeApplication

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAssignmentQa7 {

	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		taskCreation();
		addNew();
		newCustomer();
		createProject();
		createtask();
		
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
	static void taskCreation()
	{
		try
		{
			oPage.getContentTask().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void addNew()
	{
		try
		{
			oPage.getclkaddNew().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void newCustomer()
	{
		try
		{
			oPage.getclkNewcustomer().click();
			oPage.getcustomerName().sendKeys("Demouser");
			Thread.sleep(1000);
			oPage.getaddDescription().sendKeys("created the userdemo");
			Thread.sleep(1000);
			oPage.getCreateCustomer().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getclkaddNew().click();
			Thread.sleep(1000);
			oPage.getnewProject().click();
			Thread.sleep(1000);
			oPage.getProjectName().sendKeys("Demo Project");
			Thread.sleep(1000);
			oPage.getprojectDescrption().sendKeys("Demo Project descrpition");
			Thread.sleep(1000);
			oPage.getcreateProjectButtn().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createtask()
	{
		try
		{
			oPage.getaddNewTAskBtn().click();
			Thread.sleep(1000);
			oPage.getcreatenewtask().click();
			Thread.sleep(1000);
			oPage.getenterTaskName1().sendKeys("task1");
			Thread.sleep(1000);
			oPage.getenterTaskName2().sendKeys("task2");
			Thread.sleep(1000);
			oPage.getcreateTaskButn().click();
			Thread.sleep(1000);
			
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

