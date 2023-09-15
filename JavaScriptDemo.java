/*1. Goto annauniv.edu and click on "Departments" menu using Javascript
2. Goto Flipkart.com, and bring "YouTube" link into view 
(which is at the bottom of the flipkart home page)
and then click on that link*/

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptDemo {

	WebDriver driver;

	@Test
	public void openDeptUsingJs() {
		
		//1. Goto annauniv.edu and click on "Departments" menu using Javascript
		driver.get("https://annauniv.edu/");
		WebElement d=driver.findElement(By.xpath("//div[@id='navbarNavDropdown']/ul/li[4]/a"));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("click();", d);
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
	}

}
