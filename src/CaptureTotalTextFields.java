import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTotalTextFields {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.houseoffraser.co.uk/registration?returnUrl=%2f");
		
	/*	List<WebElement> listofInputs = driver.findElements(By.tagName("input"));
		System.out.println(listofInputs.size());
		*/
		
		List<WebElement> textInputs = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(textInputs.size());
		
		for(int i=0; i<textInputs.size();i++) {
			System.out.println(textInputs.get(i).getText());
		}
		
		driver.quit();

	}

}
