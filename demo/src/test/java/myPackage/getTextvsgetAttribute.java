package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextvsgetAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1342310836%3A1686554678066492&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ffgf=1&ifkv=Af_xneHTH60n-aQaZ6foeA-prj9VhEa3RFtd88QWL8r0KY4p0Hnx5RmFwMGGh48edDC2dvH33LBC&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement inputbox=driver.findElement(By.id("identifierId"));
        inputbox.clear();
        inputbox.sendKeys("pooja28399@gmail.com");
        
 // getAttribute() and getText() method
        
        System.out.println("Result of getAttribte() method: "+inputbox.getAttribute("data-initial-value"));
        System.out.println("Result of getText() method: "+inputbox.getText());
        
//getText above and below method difference..  
        
        WebElement text= driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        System.out.println("New Result of getText() method: "+text.getText());
        
        
	}

}
