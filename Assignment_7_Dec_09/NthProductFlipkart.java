package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class NthProductFlipkart{
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com");
        
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).sendKeys("Laptop");
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("Vy9RSP")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("Vy9RSP")).clear();
        Thread.sleep(2000);
        driver.findElement(By.className("Vy9RSP")).sendKeys("TV");
        driver.findElement(By.className("Vy9RSP")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("Vy9RSP")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("Vy9RSP")).clear();
        Thread.sleep(2000);
        driver.findElement(By.className("Vy9RSP")).sendKeys("Smart Phone");
        driver.findElement(By.className("Vy9RSP")).sendKeys(Keys.ENTER);
//        driver.quit();
    }
}
