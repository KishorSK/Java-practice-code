package Practicess.Practicess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://levi.in/");
	WebElement search=driver.findElement(By.xpath("//input[@placeholder='Tell us what you are looking for'][1]"));
	search.sendKeys("jeans");
	search.sendKeys(Keys.ENTER);

}
}
