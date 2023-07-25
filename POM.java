import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shiv\\Desktop\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // creating Login_page object
        Login_page login = new Login_page(driver);

        // automate login page
        login.setUsername("standard_user");
        login.setPassword("secret_sauce");
        login.Login();
    }
}
