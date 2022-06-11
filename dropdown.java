package selnium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get ("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='close-fixedban']"));
		//WebElement SelectValue=driver.findElement(By.xpath("//div[@id='withOptGroup']"));
		//SelectValue.click();
		//WebElement SelectValue1=driver.findElement(By.xpath("//div[contains(text(),'A root option')]"));
		//SelectValue1.click();
		//WebElement SelectValue2=driver.findElement(By.xpath("//div[text()='Select Title']"));
		//SelectValue2.click();
		
		
	//WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		//staticDropdown.click();
	//Select selectcolor = new Select(staticDropdown);
	//	selectcolor.selectByIndex(5);
		//selectcolor.selectByValue("9");
		//selectcolor.selectByVisibleText("Aqua");
		WebElement SelectValue3=driver.findElement(By.xpath("//div[text()='Select...']"));
		SelectValue3.click();
		//driver.navigate().to("https://demoqa.com/automation-practice-form");
	}

}
