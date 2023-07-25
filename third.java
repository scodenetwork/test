import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class third {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.scodenetwork.com/");

//        WebElement x = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
//        System.out.println(x.isEnabled());

//        WebElement img = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[3]/div/img"));
//        System.out.println(img.isDisplayed());

//        WebElement c = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/h2"));
//        System.out.println(c.getText());
    }
}