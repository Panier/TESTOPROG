package chrome.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Pliki u¿ytkownika\\Student\\Pobrane\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Hello Google...");
		driver.get("http://google.com");
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
	}

}
