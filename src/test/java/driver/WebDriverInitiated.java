package driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInitiated {

    public static WebDriver driver;
    private final static String URL = "https://terrapizza.by/";

    public WebDriverInitiated(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverInitiated() {
    }

    public static void webDriverSettings() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
  }
}
