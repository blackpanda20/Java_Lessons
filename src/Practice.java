import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");

		findElementInFrame(driver, "html > frameset > frame:nth-child(3)", "suggestions",
				"Send Help We are Under attack");

		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();

		driver.quit();

	}

	public static void findElementInFrame(WebDriver driver, String framePath, String elementID, String value) {
		WebElement frameElment = driver.findElement(By.cssSelector(framePath));
		driver.switchTo().frame(frameElment);
		driver.findElement(By.name(elementID)).sendKeys(value);
	}

}
