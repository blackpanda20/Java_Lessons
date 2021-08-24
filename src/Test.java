import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pebc.ca/pharmacists/");
		//driver.get("https://pebc.ca/pharmacy-technicians/");

		By caption = By.xpath("(//span[@class='date'])[1]");
		By result = By.xpath("(//a[@class='text-blue'])[1]");
		By btn = By.xpath("(//p/a)[1]");
		
		while(true) {
		
		WebElement captionText = driver.findElement(caption);
		WebElement resultLink = driver.findElement(result);
		
		String actualText = "July 19, 2021";
		
		if(captionText.getText().equalsIgnoreCase(actualText)) {
			resultLink.click();
			WebElement button = driver.findElement(btn);
			button.click();
			break;
		}
		
		else {
			driver.navigate().refresh();
		}
			
		}
	}

}
