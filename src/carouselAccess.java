import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class carouselAccess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
/*		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(3000);
		while(driver.findElement(By.xpath("(//div[contains(@class,'swiper-button-next')])[2]")).isDisplayed()) {
			driver.findElement(By.xpath("(//div[contains(@class,'swiper-button-next')])[2]")).click();				
			}*/
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/36106/ban-vs-sl-3rd-odi-sri-lanka-tour-of-bangladesh-2021");
		By batsmanName = By.xpath("//a[text()='Gunathilaka']");
		JavaUtil.getElement(driver, batsmanName).click();
				

	}

}
