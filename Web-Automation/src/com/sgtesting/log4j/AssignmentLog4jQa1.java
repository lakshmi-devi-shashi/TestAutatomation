package com.sgtesting.log4j;


	

	import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class AssignmentLog4jQa1 {
	public static Logger log=Logger.getLogger("ActiveTime Execution");
	public static WebDriver oBrowser=null;
		


		@Test(priority=1)
		
		public void launchBrowser()
		{
			String path=null;
			try
			{
				
				path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				
				log.info("It launches the ChromeDriver");
				oBrowser=new ChromeDriver();
				log.info("It Maximize the window!!!!!!");
				oBrowser.manage().window().maximize();
				log.info("                               ");
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
				log.info("It navigate to the ActiveTime");
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
				log.info("It login the using user name and password!!!!!");
				oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
				Thread.sleep(1000);
				
				log.info("Click the login button");
				oBrowser.findElement(By.xpath("//div[text() = 'Login ']")).click();
				Thread.sleep(1000);
				log.info("                           ");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=4)
		public void minimizeflyOutWindow()
		{
			try
			{
				log.info("It minimize the flyOut Window");
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
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
				log.info("click on the user link");
				oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
				Thread.sleep(1000);
				log.info("click on add user button");
				oBrowser.findElement(By.xpath("//div[@class='addUserButton beigeButton useNativeActive']")).click();
				Thread.sleep(1000);
				log.info("Enter the user details like firstname,lastname,emailid,username,pasword and retype password!!!!!!!!");
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
				log.info("                                                    ");
				
				

				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=6)
		public void modifyuser()
		{
			try
			{
				log.info("modifies the users");
				oBrowser.findElement(By.xpath("//div[@class='name']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys("userdemo");
				
				Thread.sleep(2000);
				
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				log.info("                                    ");
				
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
				log.info("delete the users");
				oBrowser.findElement(By.xpath("//table[@class='userNameContainer']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
				Thread.sleep(1000);
				log.info("used alert class to delete the user!!!!");
				Alert alert=oBrowser.switchTo().alert();
				log.info("switch the alert");
				String content=alert.getText();
				log.info("get the text");
				System.out.println(content);
				log.info("click on ok or cancel");
				alert.accept();
				Thread.sleep(1000);
				log.info("                          ");
				
				
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
				log.info("logout the activetime");
				oBrowser.findElement(By.xpath("//a[@class='logout']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=9)
		public void close()
		{
			try
			{
				log.info("close the browser");
				log.info("********************************************************");
				
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
