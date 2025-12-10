package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class NthProductFlipkart{
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'✕') or text()='✕']")).click();
        String[] products={"Laptop","TV","Smart Phone"};
        int[] nth ={7,13,2};
        for(int i=0;i<products.length;i++){
            WebElement searchBox=driver.findElement(By.name("q"));
            searchBox.clear();
            searchBox.sendKeys(products[i]);
            searchBox.submit();
            Thread.sleep(3000);
            List<WebElement> resultNames=driver.findElements(By.cssSelector("div._4rR01T, a.s1Q9rs"));
            if(resultNames.size()>=nth[i]){
                System.out.println(products[i] + " - " + nth[i] + "th Product: " 
                                   + resultNames.get(nth[i] - 1).getText());
            }else{
                System.out.println(products[i]+" has less than "+nth[i]+" products.");
            }
            Thread.sleep(1500);
        }
        driver.quit();
    }
}
