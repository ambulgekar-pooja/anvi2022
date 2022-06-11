package selnium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactiondemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get ("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Actions actions= new Actions(driver);
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		WebElement UserName =driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement UserEmail =driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement CurrentAdd =driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement perAdd =driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		WebElement submitbtn =driver.findElement(By.xpath("//button[@id='submit']"));
		//WebElement links =driver.findElement(By.xpath("//span[text()='links'"));
		actions.sendKeys(UserName,"anvi").perform();
		actions.sendKeys(UserEmail,"anvi@gmail.com").perform();
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		actions.sendKeys(CurrentAdd, "barshi road latur").perform();
		//select address ctrla
		actions.keyDown(CurrentAdd,Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
	//	driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		//current address copy
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		//Tab key
		//driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		//paste address
	
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		actions.sendKeys(Keys.TAB).click(submitbtn).build().perform();
		
		

		
	}


}
