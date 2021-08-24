import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalPageLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		for (int i=0; i<linkList.size(); i++) {
		String linkNames = linkList.get(i).getText();
	
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
