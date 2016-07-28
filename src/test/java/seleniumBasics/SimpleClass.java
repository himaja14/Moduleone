package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleClass {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("vfb-9")).clear();	//clear text box 
		driver.findElement(By.id("vfb-9")).sendKeys("We found the Text Box");	//Enter text in text box 
		driver.findElement(By.id("vfb-6-0")).click();
		driver.close();
	}

}
