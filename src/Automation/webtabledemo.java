package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabledemo {

		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Manual Testing\\chromedriver.exe");
			WebDriver driver  = new ChromeDriver();
			//To Find  The Elements
			driver.manage().window().maximize();
			driver.get("http://demo.borland.com/gmopost/online-catalog.htm");
			List<WebElement >itmnum=driver.findElements(By.xpath("//td[@align='center']/div//table//tr//td[1]"));
			for(WebElement temp : itmnum)
			{
				if(temp.getText().equals("1002"))
				{
					System.out.println("Inter number is present");
				}
			}
		
	}

}
