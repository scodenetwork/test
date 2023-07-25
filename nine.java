import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class nine {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");

//        driver.findElement(By.id("alertButton")).click();
//        Alert s = driver.switchTo().alert();
//        s.accept();

//        driver.findElement(By.id("promtButton")).click();
//        Alert s = driver.switchTo().alert();
//        String text = s.getText();
//        System.out.println(text);
//        s.sendKeys("aman");
//        s.accept();

        try{
            driver.findElement(By.id("timerAlertButton")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert s = driver.switchTo().alert();
            System.out.println(s.getText());
            s.accept();

        }catch(Exception e){
            System.out.println(e);
        }
//    driver.quit();
    }
}