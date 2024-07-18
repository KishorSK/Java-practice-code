package Practicess.Practicess;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class pink {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://pinkfort.co/");
		driver.findElement(By.xpath("//div[@id='kp-login-button-header-logo']")).click();
		WebElement popup =driver.findElement(By.xpath("//iframe[@id='iframe-kp']"));
		driver.switchTo().frame(popup);
		Actions action = new Actions(driver);
		action.pause(5000).build().perform();
		WebElement close=driver.findElement(By.xpath("//button[@id='desktop_close_button']"));
		close.click();
	}
	
	
}
