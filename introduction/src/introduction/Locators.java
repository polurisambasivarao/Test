package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		driver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)", "");
		js.executeScript("document.getElementById('current-age').value='40';");
		js.executeScript("document.getElementById('retirement-age').value='60';");
		
		js.executeScript("document.getElementById('current-income').value='100000';");
		js.executeScript("document.getElementById('spouse-income').value='75000';");
		js.executeScript("document.getElementById('current-total-savings').value='500000';");
		js.executeScript("document.getElementById('current-annual-savings').value='10%';");
		js.executeScript("document.getElementById('savings-increase-rate').value='0.25%';");
		
		js.executeScript("document.getElementById('yes-social-benefits').click();");
		WebElement element1 = driver.findElement(By.xpath("(//*[text()='Adjust default values'])"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",element1);
		
		js.executeScript("document.getElementById('additional-income').value='500';");
		js.executeScript("document.getElementById('retirement-duration').value='20';");
		js.executeScript("document.getElementById('include-inflation').click();");
		js.executeScript("document.getElementById('expected-inflation-rate').value='6';");
		js.executeScript("document.getElementById('retirement-annual-income').value='100000';");
		js.executeScript("document.getElementById('pre-retirement-roi').value='8';");
		js.executeScript("document.getElementById('post-retirement-roi').value='5';");
		
		WebElement element2 = driver.findElement(By.xpath("((//*[text()='Save changes']))"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",element2);
		
		js.executeScript("document.getElementById('social-security-override').value='4000';");

		WebElement element3 = driver.findElement(By.xpath("((//*[text()='Calculate']))"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",element3);
		
		


		
		
		
		
		

		




		

		
		
		
	}

}
