import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSuit {

	public static void main(String[] args) throws InterruptedException {

		ElementUtill utility = new ElementUtill();
		utility.setUp();
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://www.hubspot.com/"); By cookieAllowButton =
		 * By.xpath("//a[@id='hs-eu-confirmation-button']");
		 * utility.waitUntillElementisClickable(driver, cookieAllowButton, 5000);
		 * utility.clickOnElement(driver, cookieAllowButton); By loginLink =
		 * By.xpath("//a[@class='homepage-nav-login']"); utility.clickOnElement(driver,
		 * loginLink);
		 */
		
		driver.get("https://www.facebook.com/");
		By createNewAccountButton = By.xpath("//a[text()='Create New Account']");
		utility.clickOnElement(driver, createNewAccountButton);
		
		
		
		
		
		By firstName = By.xpath("//input[@name='firstname']");
		utility.waitUntillElementisClickable(driver, firstName,5000);		
		By lastName = By.xpath("//input[@name='lastname']");
		By email = By.xpath("//input[@name='reg_email__']");
		By pwd = By.xpath("//input[@name='reg_passwd__']");
		By dropDownMonth = By.xpath("//select[@id='month']//option");
		By dropDownDay = By.xpath("//select[@id='day']//option");
		By dropDownYear = By.xpath("//select[@id='year']//option");
		
		
		utility.sendDatatoElement(driver, firstName, "Hola");
		utility.sendDatatoElement(driver, lastName, "Hoop");	
		utility.sendDatatoElement(driver, email, "hola@hoop.com");
		utility.sendDatatoElement(driver, pwd, "Test@1234");
		utility.selectValueFromDropDown(driver, dropDownMonth, "Feb");
		utility.selectValueFromDropDown(driver, dropDownDay, "2");
		utility.selectValueFromDropDown(driver, dropDownYear, "1995");
		
		
		
		

	}

}
