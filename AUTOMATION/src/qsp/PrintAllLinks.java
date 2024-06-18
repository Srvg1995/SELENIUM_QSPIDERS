package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
System.out.println("Enter the URL");
Scanner sc=new Scanner(System.in);
String Url=sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get(Url);
List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
int count = AllLinks.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	String text = AllLinks.get(i).getText();
	System.out.println(text);
	
}
driver.quit();
	}

}
