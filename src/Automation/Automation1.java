package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Manual Testing\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		//To Find  The Elements
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in");
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("indumathi");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("U");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("No:3/469,state bank colony,CBE-44");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("indumathisingh99@gmail.com");
		driver.findElement(By.xpath("  //input[@ng-model='Phone']")).sendKeys("9629601340");

		// To Select The Radio Options
		// WebElement radio1=driver.findElement(By.xpath("//input[@value='Male']"));
		// radio1.click();			
		WebElement radio2=driver.findElement(By.xpath("//input[@value='FeMale']"));
		radio2.click();			
		WebElement option1 = driver.findElement(By.xpath("//input[@value='Cricket']"));	
		option1.click();			

		
		// selecting the languages
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("Hindi")).click();

		// selecting the skills
		Select skill = new Select(driver.findElement(By.xpath("//select[@ng-model='Skill']")));
		skill.selectByVisibleText("Android");


		//selecting the country
		Select country = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		country.selectByVisibleText("Antarctica");


		//select overall country
		Select allcountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		allcountry.selectByVisibleText("India");
		// select the cal
		Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		year.selectByVisibleText("2015");
		Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByVisibleText("January");
		Select date = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		date.selectByVisibleText("14");

		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Indumathi@123");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Indumathi@123");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		//driver.findElement(By.linkText("WebTable")).click();
		Thread.sleep(7000L);
		Actions obj =new Actions (driver);
		obj.doubleClick(driver.findElement(By.xpath("//i[@class='fa fa-pencil']"))).build().perform();
		

		Thread.sleep(9000);
		driver.close();
	}			
}

