package com.finexus.interfacedemo;

public class ChromeDriver implements WebDriver {

	public void closeTab() {
		// TODO Auto-generated method stub
		System.out.println("close chrome tab");
	}

	public void quitBrowser() {
		// TODO Auto-generated method stub
		System.out.println("quit chrome browser");
	}

	public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println("chrome click");
	}

	public void type(String element, String text) {
		// TODO Auto-generated method stub

	}

	public void mouseHover(String element) {
		// TODO Auto-generated method stub

	}

	public void launchBrowser() {
		// TODO Auto-generated method stub
		System.out.println("chrome launch");
	}

	public void launchUrl(String url) {
		// TODO Auto-generated method stub

	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void gotoNewTab() {
		// TODO Auto-generated method stub
		
	}

}
