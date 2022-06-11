package selnium;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get ("https://naukri.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Actions actions= new Actions(driver);
		//WebElement Recruiitertab =driver.findElement(By.xpath("//div[contains(text(),'Recruiters')]"));
		//actions.moveToElement(Recruiitertab).perform();
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement Doubleclickbtn =driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

		WebElement Rightclickbtn =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement dynamicclick =driver.findElement(By.xpath("//button[text()='Click Me']"));
		actions.doubleClick(Doubleclickbtn).perform();
		actions.contextClick(Rightclickbtn).perform();
		actions.click(dynamicclick).perform();
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement Dragmebtn =driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement Dropherebtn =driver.findElement(By.xpath("//div[@Id='draggable']//following-sibling::div[@id='droppable']"));
		actions.dragAndDrop(Dragmebtn, Dropherebtn).perform();
		driver.navigate().to("https://demoqa.com/tool-tips");
		WebElement Hovertoseebtn=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		actions.moveToElement(Hovertoseebtn).perform();
		System.out.println(driver.findElement(By.xpath("//button[@id='buttonToolTip']")).getText());
		WebElement TextBox = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		actions.keyDown(TextBox,Keys.SHIFT).sendKeys("Texttobeconvertedtouppercase").keyUp(Keys.SHIFT).build().perform();
	}
	
	
	

}
