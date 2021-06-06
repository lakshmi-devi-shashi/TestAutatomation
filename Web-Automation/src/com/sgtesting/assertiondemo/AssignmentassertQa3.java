package com.sgtesting.assertiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssignmentassertQa3 {
	SoftAssert softassert=new SoftAssert();
	public static WebDriver oBrowser=null;
	
	
	@Test(priority=1)
	public void launchBrowser()
	{
		String path=null;
		try
		{
			softassert.assertEquals(true, true,"lanunch the browser");
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			
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
			softassert.assertEquals(true, true,"navigate to the url");
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
			softassert.assertAll();
		}
	}
	@Test(priority=3)
	public void login()
	{
		try
		{
			softassert.assertEquals(true, true);
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']")).click();
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
			softassert.assertEquals(true, true,"minimize the fly out window");
			oBrowser.findElement(By.cssSelector("#gettingStartedShortcutsPanelId")).click();
			softassert.assertAll();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void createCustomer()
	{
		try
		{
			softassert.assertEquals(true, true,"create the customer");
			oBrowser.findElement(By.linkText("TASKS")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("body > div.dropdownContainer.addNewMenu > div.item.createNewCustomer.ellipsis")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Lakshmidevi");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Assignment Process");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			softassert.assertAll();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void modifyCustomer()
	{
		try
		{
			softassert.assertEquals(true, true,"Modify the customer");
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click(); 
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("body > div.dropdownContainer.customerStatusMenu.active > div.item.archivedContainer > div")).click();
			Thread.sleep(3000);
			softassert.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void deleteCustomer()
	{
		try
		{
			softassert.assertEquals(true, true,"delete the user");
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			softassert.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void logout()
	{
		try
		{
			softassert.assertEquals(true, true,"logout the application");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			softassert.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void closeApplication()
	{
		try
		{
			softassert.assertEquals(true, true,"close the application");
			oBrowser.close();
			softassert.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


