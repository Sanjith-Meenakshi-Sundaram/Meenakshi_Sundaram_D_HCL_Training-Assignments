package SeleniumTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultipleWindow {
  @Test
  public void handleing() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  
	  String parent=driver.getWindowHandle();
	  System.out.println(parent);
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement window=driver.findElement(By.id("openwindow"));
	  window.click();
	  Thread.sleep(5000);
	  Set<String> win1=driver.getWindowHandles();
	  for(String h:win1) {
		  if(!h.equals(parent)) {
			  driver.switchTo().window(h);
			  System.out.println(driver.getTitle());
			  driver.close();
		  }
	  }
	  
	  driver.switchTo().window(parent);
	  
	  WebElement tab=driver.findElement(By.id("opentab"));
	  tab.click();
	 Thread.sleep(5000);
	  Set<String> tab1=driver.getWindowHandles();
	  
	  for(String t:tab1) {
		  if(!t.equals(parent)) {
			  driver.switchTo().window(t);
			  System.out.println(driver.getTitle());
			  driver.close();
		  }
	  }
	  driver.switchTo().window(parent);
	  System.out.println(driver.getTitle());
  }
}