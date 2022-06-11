package selnium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirudha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get ("https://demoqa.com/browser-windows");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	String Mainwindow=driver.getWindowHandle();
	Set<String> childwindws =driver.getWindowHandles();
	Iterator<String> itr =childwindws.iterator();
	while(itr.hasNext()){
	String childwindow =itr.next();
	
	if(!Mainwindow.equalsIgnoreCase(childwindow)) {//compare main window and child window
		driver.switchTo().window(childwindow);
		System.out.println(driver.findElement(By.xpath("//[button@id='sampleHeading']")).getText());
		//driver.close();

	}
	}

}
}
