import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class second {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.saucedemo.com";
        driver.get(url);

//        List<WebElement> a = driver.findElements(By.tagName("input"));
//        if(a.size() != 0) {
//            System.out.println(a.size());
//            for(WebElement v : a){
//                System.out.println(v.getAttribute("class"));
//            }
//        }
//        WebElement element = driver.findElement(By.id("login-button"));
//
//        if (element != null){
//            System.out.println( "element found id");
//        }
//        WebElement w = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]"));
//        System.out.println(w.getText());

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        String r = driver.getCurrentUrl();
        driver.get(r);
        System.out.println(r);




     driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();


    }
}