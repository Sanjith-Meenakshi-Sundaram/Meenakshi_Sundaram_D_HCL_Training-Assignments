import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        //Partial Link
        driver.findElement(By.partialLinkText("Hom")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.quit();
    }
}
