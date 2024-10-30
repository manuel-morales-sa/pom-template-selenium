package baseClass;

import com.sun.activation.registries.MailcapParseException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

    @BeforeMethod()
    @Parameters({"url"})
    public void initialize(String url) throws InterruptedException, MailcapParseException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get(url);
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("Restarted browser");
        driver.quit();
    }
}