package basicprogram;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnyBrowser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String browser=sc.nextLine();
        WebDriver driver=null;

        if(browser.equalsIgnoreCase("chrome")) {
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge")) {
            driver=new EdgeDriver();
        }else if(browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        }else{
            System.out.println("Invalid Browser Name");
            System.exit(0);
        }
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com");
        System.out.println("Title " + driver.getTitle());
        driver.quit();
    }
}
