import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentToolTipText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement title = driver.findElement(By.xpath("//a[@href='https://kn-in.facebook.com/']"));
		String text = title.getAttribute("title");
		System.out.println(text);
		driver.quit();

	}
}
