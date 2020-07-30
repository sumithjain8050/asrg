package AIR_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shoes {

	public static void main(String[] args) {
		String key ="webdriver.gecko.driver";
		String value="./selenium softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver a=new FirefoxDriver();

		String key1 ="webdriver.chrome.driver";
		String value1="./selenium softwares/chromedriver.exe";
		System.setProperty(key1, value1);
		WebDriver a1=new ChromeDriver();
	}

}
