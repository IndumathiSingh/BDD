package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Manual Testing\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in");
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		//driver.findElement(By.linkText("SwitchTo")).click();
		//driver.findElement(By.linkText("Windows")).click();
		// using Action class
		Actions obj =new Actions (driver);
		obj.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).click().build().perform();
		obj.moveToElement(driver.findElement(By.xpath("//a[text()='Windows']"))).click().build().perform();
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		String MainWindow=driver.getWindowHandle();	
		 driver.findElement(By.xpath("//button[text()='click']")).click();
		 driver.findElement(By.linkText("Documentation")).click();
		 driver.findElement(By.linkText("Web")).click();

		 Set<String> s1=driver.getWindowHandles();

		 for(String screen:s1){
		       	if(!MainWindow.equals(screen))	
		            {    	
		           
		                    // Switching to Child window
		                    driver.switchTo().window(screen);	                                                                                                          
		                    System.out.println(driver.getTitle());
		                                 
		// Closing the Child Window.
		                        driver.close();	
		            }	
		        }

		 driver.switchTo().window(MainWindow); 

		
		obj.moveToElement(driver.findElement(By.xpath("//a[text()='Register']"))).click().build().perform();
		//using keyboard event
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).click();
		Actions object=new Actions(driver);
		object.keyDown(Keys.SHIFT).sendKeys("indumathi").keyUp(Keys.SHIFT).build().perform();
		object.sendKeys(Keys.ENTER);
		driver.close();
	} 
	
}
