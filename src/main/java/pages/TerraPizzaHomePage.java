package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerraPizzaHomePage {

    private final By PIZZA_LOCATOR = By.xpath("//*[@class='menu-navigation__main active']/li[4]");
    private final By PIZZA_HOME_PAGE_COOKIE_LOCATOR = By.xpath("//button[@class='close-icon']");
    private final WebDriver driver;

    public TerraPizzaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isEnabledCatalogPizza() {
        return driver.findElement(PIZZA_LOCATOR).isEnabled();
    }

    public void clickCatalogPizza() {
        driver.findElement(PIZZA_LOCATOR)
                .click();
    }
    public void clickCloseWindowCookie() {
        driver.findElement(PIZZA_HOME_PAGE_COOKIE_LOCATOR)
                .click();
    }
}
