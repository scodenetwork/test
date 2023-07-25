
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ten {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

//        Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
//        s.selectByIndex(6);

        Select s = new Select(driver.findElement(By.xpath("//*[@id=\"cars\"]")));
        if(s.isMultiple()){
            s.selectByIndex(1);

            s.selectByValue("volvo");
            s.selectByVisibleText("Opel");
        }


    }
}