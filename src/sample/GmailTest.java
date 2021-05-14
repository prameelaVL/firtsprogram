package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Farzana/Desktop/selenium/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("www.google.com");


	}

}
