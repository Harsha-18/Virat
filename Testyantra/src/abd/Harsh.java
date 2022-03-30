package abd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Harsh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	   List<WebElement>	objlinks =driver.findElements(By.tagName("td"));   
	   for(WebElement objcurrentlinks :objlinks)
	   {
		 String  Strlinktext=objcurrentlinks.getText();
		 System.out.println(Strlinktext);


	}

}
