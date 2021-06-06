package com.sgtesting.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentDemoQa7 {
	
	public static WebDriver oBrowser=null;

	@Test(priority=1)
	public void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(1000);
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
	public void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']")).click();

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
			oBrowser.findElement(By.cssSelector("#gettingStartedShortcutsPanelId")).click();

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



		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("body > div.dropdownContainer.addNewMenu > div.item.createNewProject.ellipsis")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project Assignement4");
			oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("Project description for create project");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void createTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
			oBrowser.findElement(By.cssSelector("body > div.dropdownContainer.addNewTaskMenu > div.item.createNewTask.ellipsis")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("First task");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void deleteTasks()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("#taskListBlock > div.tasksTable.allTasksLoaded.hasSelectedCustomer.hasSelectedProject > div.scrollableContainer > div.taskRowsTableContainer > table.createdTasksRowsTable > tbody > tr > td.names > div > div.title.ellipsis")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("#taskListBlock > div.edit_task_sliding_panel.sliding_panel > div.dropdownContainer.actionsMenu > div > div.deleteButton > div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskPanel_deleteConfirm_submitBtn']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
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
	@Test(priority=10)
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
