package com.finexus.interfacedemo;

public class EdgeDriver implements WebDriver {

	@Override
	public void closeTab() {
		// TODO Auto-generated method stub
		System.out.println("close edge tab");
	}

	@Override
	public void quitBrowser() {
		// TODO Auto-generated method stub
		System.out.println("close edge browser");
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println("click edge");
	}

	@Override
	public void type(String element, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseHover(String element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launchBrowser() {
		// TODO Auto-generated method stub
		System.out.println("launch edge");
	}

	@Override
	public void launchUrl(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void gotoNewTab() {
		// TODO Auto-generated method stub
		
	}

}
