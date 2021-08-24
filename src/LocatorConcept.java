import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://heapanalytics.com/signup");

		/*// By xPath -- 2
		// absolute xpath should not be used
		// only use relative xpath
		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Tom");
		driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Suthat");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hot@goat.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Ho0la@hoop");
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("7894561230");
		driver.findElement(By.xpath("//*[@id='companyname']")).sendKeys("SalatPapper");

		// By id -- 1
		driver.findElement(By.id("first_name")).sendKeys("Surya");
		driver.findElement(By.id("last_name")).sendKeys("Singham");
		driver.findElement(By.id("phone")).sendKeys("3216549870");
		
		// By name -- 3
		driver.findElement(By.name("first_name")).sendKeys("Japan");
		driver.findElement(By.name("last_name")).sendKeys("Jerry");
		
		// By linktext -- only for links
		driver.findElement(By.linkText("Contact Us")).click();
		
		// By partiallink -- not useful
		driver.findElement(By.partialLinkText("Learn more about")).click();*/
		
		// By cssselector -- 2
		// if id is there-----#{id}
		// if class is there------.{class}
		driver.findElement(By.cssSelector("#last_name")).sendKeys("lopez");
		
		// By class name - not recommended -- 4
		driver.findElement(By.className("checkbox-label")).click();

	}

}
