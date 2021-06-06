package com.sgtesting.autoit;

public class AutoitDemo1 {

	public static void main(String[] args) {
		executeAutoITScript();
		}
		
		static void executeAutoITScript()
		{
			try
			{
				Runtime.getRuntime().exec("E:\\ExampleAutomation\\Autoit\\firstscript1.exe");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
