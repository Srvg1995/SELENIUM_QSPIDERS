

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnAll14WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2500);
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(2500);
		email.sendKeys(Keys.SHIFT+"abd");
		Thread.sleep(2500);
		email.clear();
		WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(2500);
		String color = ele.getCssValue("color");
		String tag = ele.getTagName();
		String text = ele.getText();
		String attvalue = ele.getAttribute("href");
		System.out.println(color);
		System.out.println(tag);
		System.out.println(text);
		System.out.println(attvalue);
		boolean res = driver.findElement(By.name("login")).isEnabled();
		Thread.sleep(2500);
		boolean res1 = driver.findElement(By.name("login")).isDisplayed();
		Thread.sleep(2500);
		if(res==res1)
		{
			System.out.println("Login button is enabled & displayed");
		}
		else
		{
			System.out.println("Login button is not enabled & displayed");

		}

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2500);
		WebElement fnm = driver.findElement(By.name("firstname"));
		Thread.sleep(2500);
		WebElement snm = driver.findElement(By.name("lastname"));
		Thread.sleep(2500);
		Dimension d1 = fnm.getSize();
		Dimension d2 = snm.getSize();
		int h1 = d1.getHeight();
		int h2 = d2.getHeight();
		int w1 = d1.getWidth();
		int w2 = d2.getWidth();
		if(h1==h2 && w1==w2)
		{
			System.out.println("pass both are same size");
		}
		else {
			System.out.println("fail both are of not same size");
		}
		WebElement rbn1 = driver.findElement(By.xpath("//label[text()='Female']"));
		Thread.sleep(2500);
		WebElement rbn2 = driver.findElement(By.xpath("//label[text()='Male']"));
		Thread.sleep(2500);
		WebElement rbn3 = driver.findElement(By.xpath("//label[text()='Custom']"));
		Thread.sleep(2500);
		Point p1 = rbn1.getLocation();
		Point p2 = rbn2.getLocation();
		Point p3 = rbn3.getLocation();

		int x1 = p1.getX();
		int x2 = p2.getX();
		int x3 = p3.getX();

		if(x1==x2 && x2==x3)
		{
			System.out.println("pass all are properly aligned");
		}
		else
		{
			System.out.println("fail all are not properly aligned");
		}

	     rbn2.click();
	     Thread.sleep(2500);
	     boolean res3 = driver.findElement(By.name("sex")).isSelected();
	     if(res3==true)
	     {
	    	 System.out.println("Radio button is selected");
	     }
	     else
	     {
	    	 System.out.println("Radio button is not selected");
	     }
	     
	     driver.findElement(By.name("websubmit")).submit();
	     driver.quit();
	}
}








