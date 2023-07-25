
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;


public class window{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

//        String a = driver.getPageSource();
//        System.out.println(a);
//         driver.navigate().refresh();
//         driver.navigate().back();
//         driver.navigate().forward();
        Actions a = new Actions(driver);
        WebElement w= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
        System.out.println(w.getTagName());

        w.click();
        Point p = w.getLocation();
        System.out.println(p);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)","");
        driver.switchTo().newWindow(WindowType.TAB);
    }
}