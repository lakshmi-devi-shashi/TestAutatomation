package com.sgtesting.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages {

	public ActiTimePages(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName text field
	private WebElement username;

	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password Text Field
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}
	

	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;

	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}

	//Create WebElement for FlyOutWindow 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//cREATE WebElement for User
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement userButton;
	public WebElement getuserButton()
	{
		return userButton;
	}

	//Create WebElement of AddUser
	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")
	private WebElement oBtnAdduser;
	public WebElement getAdduserButton()
	{
		return oBtnAdduser;
	}

	//Create WebElement of firstname
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}

	//Create WebElement of lastname
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}

	//Create WebElement of email
	private WebElement email;
	public WebElement getemailId()
	{
		return email;
	}

	//Create WebElement of longindetails
	private WebElement userDataLightBox_usernameField;
	public WebElement getLonginDetails()
	{
		return userDataLightBox_usernameField;
	}


	//Create WebElement of password
	private WebElement userDataLightBox_passwordField;
	public WebElement getpasswords()
	{
		return userDataLightBox_passwordField;
	}
	//Create WebElement of CopyPasword
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getpasswordCopy()
	{
		return userDataLightBox_passwordCopyField;
	}

	//Create WebElement for CretaeUser
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement buttonIcon;
	public WebElement getCreateUserButton()
	{
		return buttonIcon;
	}
	
	//create modify the userSave Changes
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement SaveChanges;
	public WebElement getsaveChanges()
	{
		return SaveChanges;
	}
	
	//create Webelement for delete
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")
	private WebElement userNameContainer;
	public WebElement getuserNameContainer()
	{
		return userNameContainer;
	}
	//Create WebElement for Deleteclick
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteButton()
	{
		return userDataLightBox_deleteBtn;
	}
	//create WebElement foe create task
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement TaskCreation;
	public WebElement getContentTask()
	{
		return TaskCreation;
	}
	//create WebElement foe clik add new
	@FindBy(xpath="(//div[@class='addNewButton']//div)[last()-4]")
	
	private WebElement clkAddNew;
	public WebElement getclkaddNew()
	{
		return clkAddNew;
	}
	//create WebElement foe clik new customer
@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	
	private WebElement clkNewCustomer;
	public WebElement getclkNewcustomer()
	{
		return clkNewCustomer;
	}
	
	//create WebElement foe clik on customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
		
		private WebElement clkonCustomer;
		public WebElement getclkonCustomer()
		{
			return clkonCustomer;
		}
	//create WebElement foeenter customer name

	@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
	private WebElement customername;
	public WebElement getcustomerName()
	{
		return customername;
	}
	//create WebElement foe create description
@FindBy(xpath="//textarea[contains(@class,'inputFieldWithPlaceholder')]")
	
	private WebElement addDescription;
	public WebElement getaddDescription()
	{
		return addDescription;
	}
	//create WebElement foe create clikbutoon
	
@FindBy(css=("#customerLightBox_commitBtn > div > span"))
	
	private WebElement buttonTitle;
	public WebElement getCreateCustomer()
	{
		return buttonTitle;
	}
	
	//*[@id="cpTreeBlock"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]
	//create WebElement foe create editbutton
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editButton;
	public WebElement geteditButton()
	{
		return editButton;
	}
	//create WebElement for Actions customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement actioncustomer;
	public WebElement getactioncustomer()
	{
		return actioncustomer;
	}
////create WebElement for delete customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement modifycustomer;
	public WebElement getmodifycustomer()
	{
		return  modifycustomer;
	}
	
	//create WebElement for create customer project
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement newProject;
		public WebElement getnewProject()
		{
			return  newProject;
		}
		
		
	////create WebElement for delete customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecustomer;
	public WebElement getdeletecustomer()
	{
		return deletecustomer;
	}
////create WebElement for deletepermantely
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement deletepermantely;
	public WebElement getdeletepermantely()
	{
		return deletepermantely;
	}
	
	//Create WebElement for Project Name text field
	@FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
		private WebElement ProjectName;

		public WebElement getProjectName()
		{
			return ProjectName;
		}
		
		
		//Create WebElement for Project description text field
		@FindBy(xpath="//*[@id=\'projectPopup_projectDescriptionField\']")
				private WebElement projectDescrption;

				public WebElement getprojectDescrption()
				{
					return projectDescrption;
				}
			//create WebElement for create project button
				@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div")
				private WebElement createProjectButtn;
				public WebElement getcreateProjectButtn()
				{
					return createProjectButtn;
				}
				
				
				//create WebElement for delete edit project button
				
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
				private WebElement ProjecteditButtn;
				public WebElement getprojecteditButtn()
				{
					return  ProjecteditButtn;
				}
				
				//create WebElement for delete project action button
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
				private WebElement projectActionButtn;
				public WebElement getprojectActionButtn()
				{
					return  projectActionButtn;
				}
				//create WebElement for delete project  button
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
				private WebElement projectdeleteButtn;
				public WebElement getprojectdeleteButtn()
				{
					return  projectdeleteButtn;
				}
				
				//create WebElement for delete project permentely button
				@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
				private WebElement ProjectdeletepermanetlyButtn;
				public WebElement getprojectdeletepermanetlyButtn()
				{
					return  ProjectdeletepermanetlyButtn;
				}
				
				//create WebElement formodify project  Descrpition
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]")
				private WebElement modifyprojectdescription;
				public WebElement getmodifyProjectDescription()
				{
					return modifyprojectdescription;
				}
				
				//create WebElement for close project button
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
				private WebElement closeprojectdescription;
				public WebElement getcloseprojectdescription()
				{
					return closeprojectdescription;
				}
				//create WebElement for  project add new task button
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
				private WebElement addnewtask;
				public WebElement getaddNewTAskBtn()
				{
					return addnewtask;
				}
				
				
						//create WebElement for  project add new task button
						@FindBy(xpath="/html/body/div[13]/div[1]")
						private WebElement createnewtask;
						public WebElement getcreatenewtask()
						{
							return createnewtask;
						}	
						
						//create WebElement for  add new taskdetails
						@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
						private WebElement entertaskname1;
						public WebElement getenterTaskName1()
						{
							return entertaskname1;
						}	
						//create WebElement for  add new taskdetails
						@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
						private WebElement entertaskname2;
						public WebElement getenterTaskName2()
						{
							return entertaskname2;
						}	
						
						//*[@id='createTasksPopup_commitBtn']/div/span
						
						//create WebElement for  create new taskdetails
						@FindBy(xpath="//*[@id='createTasksPopup_commitBtn']/div/span")
						private WebElement createtaskbutn;
						public WebElement getcreateTaskButn()
						{
							return createtaskbutn;
						}	
				
				
				





	
	
	
	
	

	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;
	}
}