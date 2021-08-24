import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.houseoffraser.co.uk/registration?returnUrl=%2f");
		
		WebElement day = driver.findElement(By.id("Registration_DateOfBirthDay"));
		WebElement month = driver.findElement(By.id("Registration_DateOfBirthMonth"));
		WebElement year = driver.findElement(By.id("Registration_DateOfBirthYear"));
		
//		dropdownSelectByVisibleText(day,"4");
//		dropdownSelectByVisibleText(month,"December");
//		dropdownSelectByVisibleText(year, "1954");
		
		printAllOptionsUsingArray(day);
		printAllOptionsUsingArray(month);
		printAllOptionsUsingArray(year);
		
		
	
			
		}
		
		 		

	
	
	/**
	 * This method is used to select the values from dropdown using the text content
	 * @param element
	 * @param value
	 */
	public static void dropdownSelectByVisibleText(WebElement element, String value) {
			
		Select selectDay = new Select(element);
		selectDay.selectByVisibleText(value);
	
		
	}
	
	public static void printAllOptionsUsingArray(WebElement e) {
		
		ArrayList<String> ar = new ArrayList<String>();
		Select Options = new Select(e);
		List <WebElement> valueOptions = Options.getOptions();
		for(int i = 0; i<valueOptions.size(); i++) {
				String s = valueOptions.get(i).getText();
				ar.add(s);
		}
		System.out.println(ar);
		
	}
	

}
