import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private final static String URL = "https://terrapizza.by/";
    public static WebDriver driver;
    public static TerraPizzaHomePage terraPizzaHomePage;
    public static CatalogPizzaPage catalogPizzaPage;

    @BeforeClass
    public static void createConditionsTests() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        terraPizzaHomePage = new TerraPizzaHomePage(driver);
        catalogPizzaPage = new CatalogPizzaPage(driver);
        terraPizzaHomePage.clickCloseWindowCookie();
        terraPizzaHomePage.clickCatalogPizza();
        catalogPizzaPage.clickButtonChoosePizzaMargarita();
        catalogPizzaPage.clickPanelUserOrderProduct();
    }

    @AfterClass
    public static void closeConnectionTests() {
        driver.close();
    }
}
