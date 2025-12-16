package Assignment_11_Dec_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement textBox = driver.findElement(By.cssSelector("a[title='Flipkart']"));
        String tooltipText = textBox.getAttribute("title");
        System.out.println("Tooltip text is: "+tooltipText);
        driver.quit();
    }
}

