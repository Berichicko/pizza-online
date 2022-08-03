package steps;

import org.openqa.selenium.WebDriver;
import pages.CatalogPizzaPage;
import pages.TerraPizzaHomePage;
import utils.WebDriverWaitElement;

public class Steps {

    private static TerraPizzaHomePage terraPizzaHomePage;
    private static CatalogPizzaPage catalogPizzaPage;
    private static WebDriverWaitElement webDriverWait;
    private static WebDriver driver;

    public Steps(WebDriver driver) {
        Steps.driver = driver;
    }

    public Steps stepsClicksUser(WebDriver driver) {
        terraPizzaHomePage = new TerraPizzaHomePage(driver);
        catalogPizzaPage = new CatalogPizzaPage(driver);
        webDriverWait = new WebDriverWaitElement(driver);
        terraPizzaHomePage.clickCloseWindowCookie();
        terraPizzaHomePage.clickCatalogPizza();
        catalogPizzaPage.clickButtonChoosePizzaMargarita();
        webDriverWait.clickWaitWebElementIsVisible(catalogPizzaPage.PANEL_USER_ORDER_LOCATOR);
        return this;
    }
}