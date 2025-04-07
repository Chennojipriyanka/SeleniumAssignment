package TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.id("ap_email_login")).sendKeys("8379916604");
		driver.findElement(By.className("a-button-input")).submit();

		
		driver.findElement(By.id("ap_password")).sendKeys("Priyanka@123");
		driver.findElement(By.id("signInSubmit")).submit();
	}

}
