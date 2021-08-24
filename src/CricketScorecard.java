import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScorecard {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/36106/ban-vs-sl-3rd-odi-sri-lanka-tour-of-bangladesh-2021");

		getScore(driver, "Shakib Al Hasan");

	}

	public static void getScore(WebDriver driver, String playerName) {
		List<WebElement> scoreList1 = driver
				.findElements(By.xpath("//a[text()=' " + playerName + " ']//parent::div//following-sibling::div"));
		for (int i = 0; i < scoreList1.size(); i++) {
			System.out.println(scoreList1.get(i).getText());
		}
	}
}
