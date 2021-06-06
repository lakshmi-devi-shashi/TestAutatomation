package com.sgtesting.log4j;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentLog4jQa2 {
	public static Logger log=Logger.getLogger("ActiveTime Execution");
	public static WebDriver oBrowser=null;

	@Test(priority=1)
	public void launchBrowser()
	{
		String path=null;
		try
		{
			log.info("get the user directory");
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			log.info("launch the chrome Browser");
			oBrowser=new ChromeDriver();
			log.info("maxmize the chrome window");
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
			log.info("                             ");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			log.info("navigate to the url activetime");
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void login()
	{
		try
		{
			log.info("longin to the active time as admin ");
			oBrowser.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
			Thread.sleep(1000);
			log.info("longin to the active time as admin and enter password ");
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			
			Thread.sleep(1000);
			log.info("click on submit");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	
	public void minimizeflyWindow()
	{
		try
		{
			log.info("minimize the flyout window in active time page ");
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsPanel noCloseable ']")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void createUser()
	{
		try
		{
			log.info(" To create the new user click on the task");
			oBrowser.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(1000);
			log.info("click on the add newuser");
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			log.info("Enter the new user name and password");
			oBrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField' or @class='inputFieldWithPlaceholder']")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@class='inputFieldWithPlaceholder']")).sendKeys("User2 demo description");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test(priority=6)
	public void deleteUser()
	{
		try
		{
			log.info("Delete the created user");
			oBrowser.findElement(By.xpath("//div[@class='title']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void logout()
	{
		try
		{
			log.info("logout active time ");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void closeApplication()
	{
		try
		{
			log.info("close the browser");
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



