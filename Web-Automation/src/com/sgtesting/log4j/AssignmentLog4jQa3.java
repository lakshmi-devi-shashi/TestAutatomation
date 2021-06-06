package com.sgtesting.log4j;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentLog4jQa3 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("ActiveTime Execution");
	

    @Test(priority=1)
	public void launchBrowser()
	{
		String path=null;
		try
		{
			log.info("launch the browser");
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
			log.info("              ");
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
			log.info("navigate to the Active time URL");
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(1000);
			log.info("              ");
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
			log.info("Login to the ActiveTime using user name and password");
			oBrowser.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			log.info("              ");
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
			log.info("after login minimize the flyout window");
			oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsPanel noCloseable ']")).click();
			log.info("              ");
			
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
			log.info(" To add the new user click on task");
			oBrowser.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(1000);
			log.info("click on the add new user");
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			log.info("create the new customer");
			oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			log.info("Enter the user name");
			oBrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField' or @class='inputFieldWithPlaceholder']")).sendKeys("user2");
			Thread.sleep(1000);
			log.info("Enter the project decriptions");
			oBrowser.findElement(By.xpath("//textarea[@class='inputFieldWithPlaceholder']")).sendKeys("User2 demo description");
			Thread.sleep(1000);
			log.info("click on create customer");
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(1000);
			log.info("              ");
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
			log.info("Modify the customer");
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			log.info("Modify the project description");
			oBrowser.findElement(By.xpath("//textarea[@class='textarea']")).sendKeys("the user has the project descrpition");
			Thread.sleep(1000);
			log.info("click on edit button");
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			log.info("              ");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    @Test(priority=7)
	public void deleteUser()
	{
		try
		{
			log.info("Delete the user click on the title");
			oBrowser.findElement(By.xpath("//div[@class='title']")).click();
			Thread.sleep(1000);
			log.info("click on the edit button");
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			log.info("click on actions");
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(1000);
			log.info("click on delete");
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			log.info("click on delete permanently");
			oBrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);
			log.info("              ");
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
			log.info("logout the activeTime");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("              ");
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
			log.info("close the browser");
			oBrowser.close();
			log.info("              ");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
