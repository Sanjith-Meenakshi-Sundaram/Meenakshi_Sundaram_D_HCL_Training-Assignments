package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector{
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");
        WebElement searchBox = driver.findElement(By.cssSelector("#searchInput"));
        searchBox.sendKeys("Selenium Automation");
        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));
        searchButton.click();

        Thread.sleep(2000);
//        driver.quit();
    }
}
