package com.sgtesting.assertiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssignmentAssertQa1 {
	SoftAssert softassert=new SoftAssert();
	public static WebDriver oBrowser=null;

	@Test(priority=1)
	public void launchBrowser()
	{
		String path=null;
		try
		{
			
			path=System.getProperty("user.dir");
			Assert.assertNotNull(path);
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			softassert.assertEquals(true, false);
			oBrowser=new ChromeDriver();
			softassert.assertEquals(true, false);
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
			softassert.assertAll();
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
			softassert.assertEquals(true, true,"navigate to the active time");
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(1000);
			softassert.assertAll();
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
			softassert.assertEquals(true, true,"Login the user name and password");
			oBrowser.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			softassert.assertAll();
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
			softassert.assertEquals(true, true,"minimizing the browser");
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
			softassert.assertEquals(true, true,"Creating the  new user");
			oBrowser.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField' or @class='inputFieldWithPlaceholder']")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@class='inputFieldWithPlaceholder']")).sendKeys("User2 demo description");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(1000);
			softassert.assertAll();
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
			softassert.assertEquals(true, true,"Deleting the user");
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
			softassert.assertAll();
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
			softassert.assertEquals(true, true,"Logout the activetime");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			softassert.assertAll();
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
			softassert.assertEquals(true, true,"close the Browser");
			oBrowser.close();
			softassert.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



