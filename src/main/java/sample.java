import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
    static String appUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    static By eleusername= By.name("username");

    static By elepassword=By.name("password");

    static By eleloginbutton=By.linkText(" Login ");

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");

        System.setProperty("webdriver.chrome.driver","");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get(appUrl);
        Thread.sleep(2000);
        driver.findElement(eleusername).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(elepassword).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(eleloginbutton).click();
        driver.quit();

    }

}
