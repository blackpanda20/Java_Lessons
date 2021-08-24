import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandNavigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		
		driver.navigate().to("https://flipkart.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > button")).click();
		
		System.out.println(driver.getTitle());
		
	    Thread.sleep(5000);
		driver.quit();

	}

}
