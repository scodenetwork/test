import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class seven {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");


        Actions action = new Actions(driver);
        WebElement r = driver.findElement(By.id("draggable"));
        WebElement b = driver.findElement(By.id("droppable"));

        action.dragAndDrop(r,b).perform();
        String text = b.getText();

        if(text.equals("Dropped!")){
            System.out.println("pass");
        }else{
            System.out.println("fails");
        }

//    //    action.contextClick(r).perform();
//        action.doubleClick(r).perform();





    }
}