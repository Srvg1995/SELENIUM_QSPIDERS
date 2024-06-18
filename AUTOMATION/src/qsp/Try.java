package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("whatsapp web");
	 List<WebElement> details = driver.findElements(By.xpath("(//span[(text()='whatsapp web')])[1]"));
	 details.get(0).click();
	 details.get(0).getText();
driver.findElement(By.xpath("//a[text()='WhatsApp Web']")).click();

		
		driver.quit();
		
		
	}

}
