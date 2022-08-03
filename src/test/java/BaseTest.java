import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.CatalogPizzaPage;
import pages.TerraPizzaHomePage;
import steps.Steps;
import driver.WebDriverInitiated;

public class BaseTest extends WebDriverInitiated {

    public static TerraPizzaHomePage terraPizzaHomePage;
    public static CatalogPizzaPage catalogPizzaPage;
    public static Steps steps;

    @BeforeClass
    public static void createConditionsTests() {
        WebDriverInitiated.webDriverSettings();
        terraPizzaHomePage = new TerraPizzaHomePage(driver);
        catalogPizzaPage = new CatalogPizzaPage(driver);
        steps = new Steps(driver);
        steps.stepsClicksUser(driver);
      }

    @AfterClass
    public static void closeConnectionTests() {
        driver.quit();
        driver = null;
    }
}
