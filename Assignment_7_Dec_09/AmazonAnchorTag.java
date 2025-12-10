package basicprogram;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAnchorTag{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.className("a-button-text")).click();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total Anchor Tags "+links.size());

        for(WebElement link:links){
            System.out.println(link.getDomAttribute("href"));
        }
        driver.quit();
    }
}
