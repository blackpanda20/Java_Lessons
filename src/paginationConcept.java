import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");

		List<WebElement> productList = driver.findElements(By.xpath(
				"//div[@class='sc-1oj0twj-0 iKBrjg']//div[@class='swiper-slide' or @class='swiper-slide swiper-slide-active' or @class='swiper-slide swiper-slide-next']//div[@data-qa='product-name']/span/span/span"));
		ArrayList<String> products = new ArrayList<String>();

		while (driver.findElement(By.xpath("(//div[contains(@class,'swiper-button-next')])[2]")).isDisplayed()) {
			for (int i = 0; i < productList.size(); i++) {
				String productData = productList.get(i).getText();
				products.add(productData);
			}
			driver.findElement(By.xpath("(//div[contains(@class,'swiper-button-next')])[2]")).click();
		}
		for (int i = 0; i < productList.size(); i++) {
			String productData = productList.get(i).getText();
			products.add(productData);
		}
		for (int j = 0; j < products.size(); j++) {
			while (products.remove(""));
			System.out.println(products.get(j));
		}
		
		System.out.println(products.size());

	}

}
