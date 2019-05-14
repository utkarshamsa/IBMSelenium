package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("userName"));
		if(username.isEnabled())
		{
			username.sendKeys("sunil");
			username.clear();
			username.sendKeys("sunil");
		}
		if (driver.findElement(By.name("userName")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sunil");
			driver.findElement(By.xpath("//*[@name='login' and @value='Login]")).click();
		}
			
	}

}
