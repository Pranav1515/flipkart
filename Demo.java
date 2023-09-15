import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	@Test
	public void Dispaly() {
		
		driver =new ChromeDriver();
		System.out.println("Hello Pranav");
		System.out.println("Hi Pranav");
		System.out.println("This is Pranav");
		
		driver.get("https://nichethyself.com/tourism/home.html");
		
	}
}
