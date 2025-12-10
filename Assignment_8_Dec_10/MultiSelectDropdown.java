package SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectDropdown {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.cssSelector(".mbsc-textfield-tags-placeholder.mbsc-ios")).click();
	  driver.findElement(By.xpath("//div[contains(@class,'mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi') and contains(text(),'Books')]")).click();
	  driver.findElement(By.xpath("//div[contains(@class,'mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi') and contains(text(),'Home, Garden & Tools')]")).click();
	  driver.findElement(By.xpath("//div[contains(@class,'mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi') and contains(text(),'Toys, Kids & Baby')]")).click();
	  driver.findElement(By.xpath("//div[contains(@class,'mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi') and contains(text(),'Sports & Outdoors')]")).click();
//	  driver.findElement(By.xpath("//span[@class='mbsc-textfield-tags mbsc-ios mbsc-ltr  mbsc-textfield mbsc-textfield-outline mbsc-select mbsc-textfield-stacked mbsc-textfield-outline-stacked mbsc-textarea']")).click();
  }
}
