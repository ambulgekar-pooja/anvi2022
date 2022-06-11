package selnium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Relative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get ("https://www.facebook.com/");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		
		WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAccount.click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Anvit");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='websubmit']"))).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello')");
		js.executeScript("alert('Hello team')");
		FluentWait wait1= new FluentWait(driver);
		wait1.withTimeout(50000,TimeUnit.SECONDS);
		wait1.pollingEvery(25000,TimeUnit.SECONDS);
		wait1.ignoring(NoAlertPresentException.class);
		Function<WebDriver, Boolean> function =new Function<WebDriver,Boolean>()
		{
			public Boolean apply(WebDriver arg0) {
				{
					driver.switchTo().alert().accept();
					return true;
				}
			}
		};
	wait1.until(function);
		
		
				
		
		//Thread.sleep(2000);
		//WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		//Thread.sleep(2000);
		//Firstname.sendKeys("Anvit");
		//*precedding*//
		WebElement username = driver.findElement(By.xpath("//*[@name='login']//preceding::input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//*[@name='login']//preceding::input[@id='pass']"));
		username.sendKeys("poojadeshpande41@gmail.com");	
		password.sendKeys("133345");
		//WebElement createnewaccount = driver.findElement(By.xpath("//*[@class='_6ltg']//following-sibling::div[3]//a"));
		//createnewaccount.click();
		
	
		
		
		//*child *//
		//WebElement username = driver.findElement(By.xpath("//*[@class='_9vtf']//child::input[@id='email']"));
		//WebElement password = driver.findElement(By.xpath("//*[@class='_9vtf']//child::input[@id='pass']"));
		username.sendKeys("poojadeshpande41@gmail.com");	
		password.sendKeys("133345");
	
		
		
		
			
		///*following*//
	//	WebElement username = driver.findElement(By.xpath("//*[@class='_9vtf']//following::input[@id='email']"));
	//	WebElement password = driver.findElement(By.xpath("//*[@class='_9vtf']//following::input[@id='pass']"));
		username.sendKeys("poojadeshpande41@gmail.com");	
		password.sendKeys("133345");
	//	WebElement username = driver.findElement(By.xpath("//input[contains(@class,'inputtext ') and @id='email']"));
		//WebElement username = driver.findElement(By.xpath("//input[contains(@class,'inputtext ') and @id='email']"));
		//WebElement username = driver.findElement(By.xpath("//input[contains(@data-testid,'email')]"));
		//WebElement username = driver.findElement(By.xpath("//input[contains(@class,'inputtext ') and @id='email']"));
	//	username.sendKeys("poojadeshpande41@gmail.com");
		
		//WebElement username = driver.findElement(By.id("email"));
		//WebElement password = driver.findElement(By.id("pass")); 
		//WebElement login = driver.findElement(By.name("login"));//not properly id
		WebElement createnewaccount = driver.findElement(By.xpath("//*[@class='_6ltg']//following-sibling::div[3]//a"));
		createnewaccount.click();
		
	//	username.sendKeys("poojadeshpande41@gmail.com");/[contains(text(),'Forgotten password?' )]"));
		//forgotpass.click();
		
		//* following sibling*//
	//	WebElement forgotpass = driver.findElement(By.xpath("//*[@class='_6ltg']//following-sibling::div[1]//a"));
	//	forgotpass.click();
		//WebElement forgotpass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//forgotpass.click();
	//WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Log In' )]"));
//	loginbtn.click();
	//forgotpass.click();
//WebElement loginbtn = driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d')]"));
//loginbtn.click();
		//WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Log In']"));
	//	loginbtn.click();

	}

}
