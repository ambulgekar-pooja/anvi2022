package selnium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		String mainwindow=driver.getWindowHandle();
		WebElement Dos=driver.findElement(By.xpath("//a[contains(text(),'have an account' )]"));
		Dos.click();
		driver.switchTo();
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("ANVI");
	//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[3]/input")).sendKeys("ojal");
	//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[4]/input")).click();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qertth");
		//driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		//driver.findElement(By.cssSelector("button[class='button-orange wide']")).click();
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();

		driver.findElement(By.className("button-orange.wide")).click();




	}

}
