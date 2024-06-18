import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethods {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
	String tag = ele.getTagName();
	String text = ele.getText();
	String attVal = ele.getAttribute("href");
	System.out.println(tag);
	System.out.println(text);
	System.out.println(attVal);
	driver.quit();
	}

}