package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assaignment2Popup {

	public static void main(String[] args) throws InterruptedException {
		//OPEN BROWSER
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//ENTER URL
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
//ENTER THE POLICY NO AS 123
driver.findElement(By.id("policynumber")).sendKeys("123");
Thread.sleep(2000);
//CLICK ON DOB & SELECT YOUR DOB
driver.findElement(By.id("dob")).click();
Thread.sleep(2000);
WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
Select s=new Select(month);
Thread.sleep(2000);
s.selectByVisibleText("Nov");
WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
Select s1=new Select(year);
Thread.sleep(2000);
s1.selectByValue("1995");
driver.findElement(By.xpath("//a[@data-date='1']")).click();
Thread.sleep(2000);
//ENTER THE CONTACT NO.AS 9845098450
driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
Thread.sleep(2000);
//CLICK ON "LETS RENEW BUTTON"
driver.findElement(By.id("renew_policy_submit")).click();
Thread.sleep(2000);
//VERIFY THE TEXT "PLS ENTER VALID POLICY NO." IS DISPLAYED OR NOT.
String text = driver.findElement(By.id("policynumberError")).getText();
Thread.sleep(2000);
System.out.println(text);
driver.quit();
	}

}
