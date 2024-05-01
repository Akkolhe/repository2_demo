package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		/*
//Launching Chrome Browser.. 
 
		 * 
		 * System.setProperty("Webdriver.chrome.driver","‪D:\\Download\\java_lib\\Java_Selenium\\chromedriver.exe"); WebDriver
		 * driver=new ChromeDriver(); 
		 * driver.get("https://www.google.co.in/webhp");
		 * 
//Launching the Edge browser..
 
		 * 
		 * System.setProperty("webdriver.edge.browser","D:\\Download\\java_lib\\Java_Selenium\\msedgedriver.exe"); WebDriver d=new
		 * EdgeDriver(); 
		 * d.get("https://www.google.co.in/webhp");
		 */
		
//Using Maven webDriverManager dependency..for Edge Browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		System.out.println("Title of the URL: "+ driver.getTitle());
		System.out.print("URL of the WebPage: " + driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
			
	}

}
