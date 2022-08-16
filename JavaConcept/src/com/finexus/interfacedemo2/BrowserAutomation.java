package com.finexus.interfacedemo2;

interface TakeScreenshot1
{
	void getScreenshot();
}

interface ScriptRunner
{
	void runScript();
}

interface WebDriver1 extends TakeScreenshot1,ScriptRunner {

	void quitBrowser();
}

class ChromeDriverDemo implements WebDriver1
{

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runScript() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitBrowser() {
		// TODO Auto-generated method stub
		
	}
	
}


public class BrowserAutomation {

	public static void main(String[] args) {
	
		WebDriver1 d=new ChromeDriverDemo();

	}

}
