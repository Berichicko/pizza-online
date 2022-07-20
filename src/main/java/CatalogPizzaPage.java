import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CatalogPizzaPage {

    private final By PIZZA_MARGARITA_LOCATOR = By.xpath("//div[@data-item-id='576']");
    private final By BUTTON_CHOOSE_PIZZA_MARGARITA_LOCATOR = By.xpath("//button[@data-id='364']");
    private final By CATALOG_NAME_PIZZA_MARGARITA_LOCATOR = By.xpath("//div[contains(text(),'Пицца Маргарита')]");
    private final By CATALOG_PRICE_PIZZA_MARGARITA_LOCATOR = By.xpath("//span[@class='price-val price-val-id-364']");
    private final By PIZZA_PANEL_USER_ORDER_LOCATOR = By.xpath("//div[@class='basket__products-item-info-wrap']");
    private final By PIZZA_NAME_PANEL_USER_ORDER_LOCATOR = By.xpath("//div[contains(text(), 'Пицца Маргарита')][last()] ");
    private final By PIZZA_PRICE_PANEL_USER_ORDER_LOCATOR = By.xpath("//div[@class='basket__top-text']/div[@class='basket__sum']/span");
    private final By PANEL_USER_ORDER_LOCATOR = By.xpath("//div[@class='basket__btn-top basket__top basket__btn-top--sm']");



    private final WebDriver driver;

    public CatalogPizzaPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickButtonChoosePizzaMargarita() {
        driver.findElement(BUTTON_CHOOSE_PIZZA_MARGARITA_LOCATOR)
                .click();
    }

    public WebElement waitWebElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void clickPanelUserOrderProduct() {
        WebElement menu = driver.findElement(PANEL_USER_ORDER_LOCATOR);
        waitWebElementIsVisible(menu).click();
    }

    public boolean isEnabledPizzaMargarita() {
        return driver.findElement(PIZZA_MARGARITA_LOCATOR).isEnabled();
    }

    public boolean isEnabledPanelUserOrder() {
        return driver.findElement(PANEL_USER_ORDER_LOCATOR).isEnabled();
    }

    public boolean isEnabledPizzaPanelUserOrder() {
        return driver.findElement(PIZZA_PANEL_USER_ORDER_LOCATOR).isEnabled();
    }

    public String getNameCatalogPizzaMargarita() {
        return driver.findElement(CATALOG_NAME_PIZZA_MARGARITA_LOCATOR).getText();

    }

    public String getPriceCatalogPizzaMargarita() {
        return driver.findElement(CATALOG_PRICE_PIZZA_MARGARITA_LOCATOR).getText();
    }

    public String getNameUserPanelOrderPizzaMargarita() {
        return driver.findElement(PIZZA_NAME_PANEL_USER_ORDER_LOCATOR).getText();
    }

    public String getPriceUserPanelOrderPizzaMargarita() {
        return driver.findElement(PIZZA_PRICE_PANEL_USER_ORDER_LOCATOR).getText();
    }
}
