package RinaL2TestNG.RinaL2TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaxInternationalTestCases {
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException
	
	{
		System.out.println("Login Test ");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("https://qa.max.com/login/");
		Thread.sleep(5000);
		
		driver.findElement(By.id("myusername")).sendKeys("11103");
		Thread.sleep(5000);
		
		driver.findElement(By.id("mypassword")).sendKeys("Cheese456!");
		Thread.sleep(5000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
		
		System.out.println("Login Test is passed");
}
 @Test(priority=2)
	public void Maxhomepageoptions() throws InterruptedException
	
	{
		System.out.println("Max International Homepage");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://qa.max.com/home/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("countries")).click();
		Select s=new Select(driver.findElement(By.id("countries")));
		Thread.sleep(2000);
		
		s.selectByValue("US");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"menu2\"]/div/div/div/div[1]/div/div/a/img")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		System.out.println("Max International Test Case Passed");
		
		
	}
	
}
