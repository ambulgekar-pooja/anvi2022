package selnium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get ("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		WebElement Loginbtn = driver.findElement(By.xpath("//*[@name='login']")); // Wrong Locator inserted
		username.sendKeys("poojadeshpande41@gmail.com");							
		password.sendKeys("1333");
		Loginbtn.click();
		//WebElement Forgotpass=driver.findElement(By.linkText("Forgotten password?"));
		//Forgotpass.click();
		//WebElement createnewaccount=driver.findElement(By.partialLinkText("Create"));
		//createnewaccount.click();
	//	WebElement Forgotpass=driver.findElement(By.linkText("Facebook Pay"));
		//Forgotpass.click();
		//WebElement Forgotpass=driver.findElement(By.linkText("Create a Page"));
		//Forgotpass.click();
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("Number of links" +links.size());
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("Number of images" +image.size());
	}

}
