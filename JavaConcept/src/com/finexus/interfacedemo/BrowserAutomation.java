package com.finexus.interfacedemo;



public class BrowserAutomation {

	public static void main(String[] args) {
		
		String browser="edge";
		WebDriver driver;
		
		if(browser.equalsIgnoreCase("ch"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
				
		driver.launchBrowser();
		driver.click("ele1");
		
		System.out.println(WebDriver.BROWSER_SUPPORT);
		

	}

}
