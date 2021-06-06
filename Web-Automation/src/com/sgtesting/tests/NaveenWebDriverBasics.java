package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenWebDriverBasics {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		
		
	}
	static void launchBrowser()
	{
		String path=null;
		try 
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			System.out.println(path);
			oBrowser= new ChromeDriver();
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
			oBrowser.get("https://www.facebook.com/");
			oBrowser.findElement(By.xpath("//*[@id=\'u_f_b_Ab\']")).sendKeys("lakshmidevi");
			//oBrowser.findElement(By.xpath("//*[@id=\'container\']")).click();
			//oBrowser.findElement(By.xpath("//*[@id='firstname']")).sendKeys("lakshmidevi");
			//oBrowser.findElement(By.xpath("//*[@id=\'lastname\']")).sendKeys("devi");
			//oBrowser.findElement(By.xpath("//*[@id=\'Email\']")).sendKeys("Lakshmidevi0660@gmail.com");
			//oBrowser.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Ab1234");
			//oBrowser.findElement(By.xpath("//*[@id=\'showpassword\']")).click();
	
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
