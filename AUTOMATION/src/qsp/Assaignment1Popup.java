package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assaignment1Popup {

	public static void main(String[] args) throws InterruptedException {
		//OPEN BROWSER
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//ENTER URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//CLICK ON ALERT WITH OK&CANCEL BUTTON
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(2000);
		//CLICK ON CONFIRM BOX BUTTON
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		//CLICK ON CANCEL BUTTON ON THE POPUP
		a.dismiss();
		System.out.println(text);
		String msg = driver.findElement(By.id("demo")).getText();
		Thread.sleep(2000);
		//VERIFY THE TEXT "YOU PRESSED CANCEL"IS DISPLAYED OR NOT
		if(msg.equals("You Pressed Cancel"))
		{
			System.out.println("the proper msg is getting and text case is pass");
		}
		else
		{
			System.out.println("not getting proper msg");
		}
		driver.quit();
	}

}
