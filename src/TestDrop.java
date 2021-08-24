import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/signup");

	
		Thread.sleep(5000);

		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='Day']/option"));

		for (int i = 0; i < allOptions.size(); i++) {

			String s = allOptions.get(i).getText();
			System.out.println(s);
			if (s.equals("27")) {
				allOptions.get(i).click();
				break;
			}

		}

	}

}
