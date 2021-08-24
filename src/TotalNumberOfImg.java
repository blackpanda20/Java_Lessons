import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumberOfImg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		System.out.println(imageList.size());
	for (int i=0; i<imageList.size();i++) {
		System.out.println(imageList.get(i).getAttribute("src"));
		}
	}

}
