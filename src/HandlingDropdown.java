import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://heapanalytics.com/signup");
		
		//handle drop box
		Select selct = new Select(driver.findElement(By.id("employee_count_range")));
		selct.selectByVisibleText("201-500 employees");
		
	}

}
