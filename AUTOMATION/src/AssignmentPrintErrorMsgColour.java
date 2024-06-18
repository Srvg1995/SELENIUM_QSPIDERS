import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPrintErrorMsgColour {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.name("login")).click();
	String value = driver.findElement(By.linkText("Find your account and log in.")).getCssValue("color");
	System.out.println(value);
	driver.quit();
	
	

	}

}
