import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		WebElement frameElement = driver.findElement(By.name("main"));
		//driver.switchTo().frame(frameElement);
		//driver.switchTo().frame("navbar");
		driver.switchTo().frame(3);
		
		
		String text = driver.findElement(By.cssSelector("body > h3")).getText();
		System.out.println(text);

	}

}
