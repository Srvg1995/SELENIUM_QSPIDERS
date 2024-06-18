import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemoOrangeHRMApplication {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2500);
WebElement un = driver.findElement(By.name("username"));
un.sendKeys("Admin");
WebElement pw = driver.findElement(By.name("password"));
pw.sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
String url = driver.getCurrentUrl();
System.out.println(url);
driver.quit();

	}

}
