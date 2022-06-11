package selnium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='close-fixedban']"));
		driver.findElement(By.xpath("//*[contains(@id,'dateOfBirth')]")).click();
		WebElement Year= driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__year-select')]"));
		Select selectYear = new Select(Year);
		selectYear.selectByValue("1917");
		WebElement Month =driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__month-select')]"));
		Select selectMonth = new Select(Month);
		selectMonth.selectByIndex(2);
		WebElement day =driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--022')]"));
		day.click();
		
	}
	

}
