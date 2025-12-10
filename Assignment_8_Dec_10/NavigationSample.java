package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationSample {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.google.com");
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.youtube.com/");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
//	  driver.navigate().forward();
	  driver.navigate().to("https://www.google.com");
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  driver.quit();
  }
}
