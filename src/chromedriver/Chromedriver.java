package chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromedriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raghuvicky\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
	}
}
