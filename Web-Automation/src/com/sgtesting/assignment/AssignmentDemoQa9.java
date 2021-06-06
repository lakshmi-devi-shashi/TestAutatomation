package com.sgtesting.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentDemoQa9 {
	public static WebDriver oBrowser=null;
	public static WebElement webele= null;

	@Test(priority=1)
	public void launchBrowser()
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
	@Test(priority=2)
	public void navigate()
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
	@Test(priority=3)
	public void loginasAdmin()
	{

		try
		{
			webele=oBrowser.findElement(By.id("username"));
			webele.sendKeys("admin");
			webele=oBrowser.findElement(By.name("pwd"));
			webele.sendKeys("manager");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			webele.click();


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
			webele=oBrowser.findElement(By.cssSelector("#gettingStartedShortcutsPanelId"));
			webele.click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void createUsers1()
	{
		try
		{
			webele=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a"));
			webele.click();
			webele=oBrowser.findElement(By.cssSelector("#createUserDiv > div > div.buttonText"));
			webele.click();
			webele=oBrowser.findElement(By.name("firstName"));
			webele.sendKeys("User1");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.name("lastName"));
			webele.sendKeys("Demo");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.id("userDataLightBox_emailField"));
			webele.sendKeys("Demouser1@gmail.com");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.name("username"));
			webele.sendKeys("UserDemo1");
			webele=oBrowser.findElement(By.name("password"));
			webele.sendKeys("1234");
			webele=oBrowser.findElement(By.name("passwordCopy"));
			webele.sendKeys("1234");

			webele=oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));
			webele.click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)

	public void createUsers2()
	{
		try
		{
			webele=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a"));
			webele.click();
			webele=oBrowser.findElement(By.cssSelector("#createUserDiv > div > div.buttonText"));
			webele.click();
			webele=oBrowser.findElement(By.name("firstName"));
			webele.sendKeys("User2");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.name("lastName"));
			webele.sendKeys("Demo2");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.id("userDataLightBox_emailField"));
			webele.sendKeys("Demouser2@gmail.com");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.name("username"));
			webele.sendKeys("UserDemo2");
			webele=oBrowser.findElement(By.name("password"));
			webele.sendKeys("123456");
			webele=oBrowser.findElement(By.name("passwordCopy"));
			webele.sendKeys("123456");

			webele=oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));
			webele.click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)

	public void createUsers3()
	{
		try
		{
			webele=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a"));
			webele.click();
			webele=oBrowser.findElement(By.cssSelector("#createUserDiv > div > div.buttonText"));
			webele.click();
			webele=oBrowser.findElement(By.name("firstName"));
			webele.sendKeys("User3");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.name("lastName"));
			webele.sendKeys("Demo3");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.id("userDataLightBox_emailField"));
			webele.sendKeys("Demouser3@gmail.com");
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.name("username"));
			webele.sendKeys("UserDemo3");
			webele=oBrowser.findElement(By.name("password"));
			webele.sendKeys("12345678");
			webele=oBrowser.findElement(By.name("passwordCopy"));
			webele.sendKeys("12345678");

			webele=oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span"));
			webele.click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void LogoutAdmin()
	{
		try
		{
			webele=oBrowser.findElement(By.linkText("Logout"));
			webele.click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void loginasuser1()
	{

		try
		{
			webele=oBrowser.findElement(By.id("username"));
			webele.sendKeys("UserDemo1");
			webele=oBrowser.findElement(By.name("pwd"));
			webele.sendKeys("1234");
			Thread.sleep(1000);

			webele=oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			webele.click();

			JavascriptExecutor js = (JavascriptExecutor)oBrowser;
			js.executeScript("window.scroll(0,350)","");
			webele=oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span"));
			webele.click();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public void LogoutUser1()
	{
		try
		{
			webele=oBrowser.findElement(By.id("logoutLink"));
			webele.click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void loginasuser2()
	{

		try
		{
			webele=oBrowser.findElement(By.id("username"));
			webele.sendKeys("UserDemo2");
			webele=oBrowser.findElement(By.name("pwd"));
			webele.sendKeys("123456");
			Thread.sleep(1000);

			webele=oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			webele.click();

			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor)oBrowser;
			js.executeScript("window.scroll(0,350)","");
			webele=oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span"));
			webele.click();
			Thread.sleep(1000);



		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	public void LogoutUser2()
	{
		try
		{
			webele=oBrowser.findElement(By.id("logoutLink"));
			webele.click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	public void loginasuser3()
	{

		try
		{
			webele=oBrowser.findElement(By.id("username"));
			webele.sendKeys("UserDemo3");
			webele=oBrowser.findElement(By.name("pwd"));
			webele.sendKeys("12345678");
			Thread.sleep(1000);

			webele=oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
			webele.click();
			JavascriptExecutor js = (JavascriptExecutor)oBrowser;
			js.executeScript("window.scroll(0,350)","");
			webele=oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span"));
			webele.click();
			Thread.sleep(1000);



		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void LogoutUser3()
	{
		try
		{
			webele=oBrowser.findElement(By.id("logoutLink"));
			webele.click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	public void deleteUser1()
	{
		try
		{
			webele=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a"));
			webele.click();
			webele=oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]"));
			webele.click();
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.id("userDataLightBox_deleteBtn"));
			webele.click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	public void deleteUser2()
	{
		try
		{
			webele=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a"));
			webele.click();
			webele=oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]"));
			webele.click();
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.id("userDataLightBox_deleteBtn"));
			webele.click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=17)
	public void deleteUser3()
	{
		try
		{
			webele=oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a"));
			webele.click();
			webele=oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]"));
			webele.click();
			Thread.sleep(1000);
			webele=oBrowser.findElement(By.id("userDataLightBox_deleteBtn"));
			webele.click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=18)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=19)
	public void closeApplication()
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
