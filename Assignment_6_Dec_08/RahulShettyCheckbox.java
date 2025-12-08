import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyCheckbox {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        driver.findElement(By.cssSelector("input[value='radio1']")).click();
//        driver.findElement(By.cssSelector("input[value='radio2']")).click();
        driver.findElement(By.cssSelector("input[value='radio3']")).click();

        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption2")).click();
       driver.quit();
    }
}
