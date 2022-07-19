import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    private final static String URL = "https://terrapizza.by/";
    protected static WebDriver driver;

    @BeforeClass
    public static void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);



    }

    @AfterClass
    public static void closeConnection() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
