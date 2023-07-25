import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class eight {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

     //   Actions action = new Actions(driver);

        WebElement check = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        check.click();

        WebElement check1 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
        check1.click();
    }
}