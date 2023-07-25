import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {

    public Login_page(WebDriver driver){
        this.driver=driver;
    }
    WebDriver driver;
    By username = By.id("user-name");
    By password = By.id("password");
    By Login = By.id("login-button");

    // method for username
    public void setUsername(String a){
        driver.findElement(username).sendKeys(a);
    }

    // method for password
    public void setPassword(String b){
        driver.findElement(password).sendKeys(b);
    }

    // method to click login button
    public  void Login(){
        driver.findElement(Login).click();
    }
}
