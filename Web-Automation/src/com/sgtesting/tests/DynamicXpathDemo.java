package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		relativeXpathUsingTagNameAlone();

	}
	static void launchBrowser()
	{
		String path=null;//path should be declared as null
		try
		{
			path=System.getProperty("user.dir");//user directory
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");//chrome.exe driver path
			System.out.println(path);
			oBrowser=new ChromeDriver();//lanch chrome
			oBrowser.manage().window().maximize();//maximize the chrome window
			
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
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * case 1: Identifying the Element based on tagname alone
	 * syntax:??<tagname>
	 * it will work on based on first occurance of the tagename
	 * it will work based on the index it will start from 1
	 */
	static void relativeXpathUsingTagNameAlone()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@id='username' or @class='textField']")).sendKeys("admin");;
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
