package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		String Url = driver.getCurrentUrl();
		
		if(Url.equals("https://www.selenium.dev/downloads/"))
		{
			System.out.println("url is navigating successfully & pass");
		}
        else
		{
			System.out.println("url is not navigating successfully & fail");

		}
		driver.quit();
	}
}
