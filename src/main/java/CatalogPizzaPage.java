import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPizzaPage  {

    private static final By PIZZA_MARGARITA_LOCATOR = By.xpath("//div[@data-item-id='576']");
    private static final By BUTTON_CHOOSE_PIZZA_MARGARITA_LOCATOR = By.xpath("//button[@data-id='360']");
    private static final By PANEL_USER_ORDER_LOCATOR = By.xpath("//div[@class='shopping-cart-btn page-cap__shopping-cart-btn'][1]");
    private static final By PIZZA_PANEL_USER_ORDER_LOCATOR = By.xpath("//div[@class='basket__products-item-info-wrap']");
    private static final By PIZZA_NAME_PANEL_USER_ORDER_LOCATOR = By.xpath("//div[@class='basket__products-item-name']");
    private static final By PIZZA_SIZE_PANEL_USER_ORDER_LOCATOR = By.xpath("//span[@class='size-product']");
    private static final By PIZZA_WEIGHT_PANEL_USER_ORDER_LOCATOR = By.xpath("//div[@class='basket__products-item-info-heft']");
    private static final By PIZZA_PRICE_PANEL_USER_ORDER_LOCATOR = By.xpath("//span[@class='main-prod-price']");
    private static final By PIZZA_AMOUNT_PANEL_USER_ORDER_LOCATOR = By.xpath("//input[@class='basket__counter-input inp-count-el-0']");

    private WebDriver driver;

    public CatalogPizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonChoosePizzaMargarita() {
        driver.findElement(BUTTON_CHOOSE_PIZZA_MARGARITA_LOCATOR)
                .click();
    }

    public void clickPanelUserOrderProduct() {
        driver.findElement(PANEL_USER_ORDER_LOCATOR).click();
    }

    public boolean isDisplayedPizzaMargarita() {
        return driver.findElement(PIZZA_MARGARITA_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedButtonChoosePizzaMargarita() {
        return driver.findElement(BUTTON_CHOOSE_PIZZA_MARGARITA_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedPanelUserOrder() {
        return driver.findElement(PANEL_USER_ORDER_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedPizzaPanelUserOrder() {
        return driver.findElement(PIZZA_PANEL_USER_ORDER_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedNamePizzaPanelUserOrder() {
        return driver.findElement(PIZZA_NAME_PANEL_USER_ORDER_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSizePizzaPanelUserOrder() {
        return driver.findElement(PIZZA_SIZE_PANEL_USER_ORDER_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedWeightPizzaPanelUserOrder() {
        return driver.findElement(PIZZA_WEIGHT_PANEL_USER_ORDER_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedPricePizzaPanelUserOrder() {
        return driver.findElement(PIZZA_PRICE_PANEL_USER_ORDER_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedAmountPizzaPanelUserOrder() {
        return driver.findElement(PIZZA_AMOUNT_PANEL_USER_ORDER_LOCATOR).isDisplayed();
    }

}
