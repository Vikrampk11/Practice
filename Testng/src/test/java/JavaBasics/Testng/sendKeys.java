package JavaBasics.Testng;

import java.util.Scanner;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class sendKeys {
	@Test
	public void getInput() throws InterruptedException
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter teh text to be searched:");
		String input = scan.nextLine();		
		System.out.println(input);
		System.setProperty("webdriver.chrome.driver", "/Users/vipremkumar/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='gs_lc0']/input[1]")).sendKeys(input);
	}

}
