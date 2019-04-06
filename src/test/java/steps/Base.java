package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Excel\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
    return driver=new ChromeDriver();

}
public void loadUrl(String url) {
	driver.get(url);

}

}

