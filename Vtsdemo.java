package vtssite;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Vtsdemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\Sneha\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
WebDriver driver	 = new FirefoxDriver();
driver.get("https://www.vts.com/");
Thread.sleep(5000);
driver.switchTo().frame("ifrmCookieBanner");
driver.findElement(By.xpath("//button[@class='sp-close-button']/img")).click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@id='Nav Demo Request']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@class='lity-close white-popup-close']")).click();
driver.switchTo().alert().dismiss();
	}
}
