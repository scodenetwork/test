import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String source = driver.getPageSource();
        System.out.println(title);
        System.out.println(url);
        System.out.println(source.length());

    }
}
