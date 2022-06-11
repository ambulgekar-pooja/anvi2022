package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get ("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass")); 
		WebElement login = driver.findElement(By.name("login"));//not properly id
		username.sendKeys("poojadeshpande41@gmail.com");							
		password.sendKeys("1333");
		login.click();
		//WebElement login = driver.findElement(By.className("_42ft"));
		//login.click();
		//WebElement CreateNewaccount= driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
		//CreateNewaccount.click();
	}

}
