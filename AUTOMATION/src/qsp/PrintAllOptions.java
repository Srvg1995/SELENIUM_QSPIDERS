package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("find:///c:/users/Qsp/Desktop/Hotel.html");
     WebElement slvListBox = driver.findElement(By.id("slv"));
     Select s=new Select(slvListBox);
     List<WebElement> allOptions = s.getOptions();
     for (int i=0;i< allOptions.size(); i++) {
    	 String text = allOptions.get(i).getText();
    	 System.out.println(text);
     }
     driver.quit();
    	 
		
	}
	}


