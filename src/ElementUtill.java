import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ElementUtill {

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	}

	public WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public void clickOnElement(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	public void waitUntillElementisClickable(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void sendDatatoElement(WebDriver driver, By locator, String data) {
		getElement(driver, locator).sendKeys(data);
	}

	public void selectValueFromDropDown(WebDriver driver, By locator, String value) {
		List<WebElement> options = driver.findElements(locator);

		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if (text.equals(value)) {
				options.get(i).click();
			}
		}
	}

}
