package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
// isDisplayed method and isEnabled method
		
		WebElement searchstore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status: "+ searchstore.isDisplayed());
		System.out.println("Enabled Status: "+ searchstore.isDisplayed());
		
// isSelected method ...used for radio buttons, checkboxes and dropdowns
		
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		male.click();
		System.out.println("Selected status for Male: "+male.isSelected());
		System.out.println("Selected status for Female: "+female.isSelected());
		
		
	}

}
