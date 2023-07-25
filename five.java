import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class five {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.saucedemo.com";
        driver.get(url);

        // login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        // login end

        String r = driver.getCurrentUrl();
        driver.get(r);
        System.out.println(r);


         List <WebElement> t = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
         System.out.println(t.get(0).getText());

//            for(WebElement v : t){
//                System.out.println(v.getText());
//            }




    }
}