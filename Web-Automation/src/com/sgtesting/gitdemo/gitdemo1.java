package com.sgtesting.gitdemo;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1). lanchBrowser --> navigate --> login --> createUser --> deleteUser --> logout --> closeApplication

public class gitdemo1 {
	public static WebDriver oBrowser=null;
	

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyOutWindow();
		createUser();
		deleteUser();
		logout();
		close();

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
	static void login()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text() = 'Login ']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeflyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='addUserButton beigeButton useNativeActive']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@*='firstName']")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='lastName'][@id='userDataLightBox_lastNameField']")).sendKeys("Demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='email' or @id='userDataLightBox_emailField']")).sendKeys("userDemo@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='username' and @id='userDataLightBox_usernameField']")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
			
			

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//table[@class='userNameContainer']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(1000);
			Alert alert=oBrowser.switchTo().alert();
			String content=alert.getText();
			System.out.println(content);
			alert.accept();
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
			oBrowser.findElement(By.xpath("//a[@class='logout']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
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
