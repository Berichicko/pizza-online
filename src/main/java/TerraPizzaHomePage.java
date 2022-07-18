import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerraPizzaHomePage {

    private final By PIZZA_LOCATOR = By.xpath("//*[@class='menu-navigation__main active']/li[4]");
    private WebDriver driver;

    public TerraPizzaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayedCatalogPizza() {
        return driver.findElement(PIZZA_LOCATOR).isDisplayed();
    }

    public void clickCatalogPizza() {
        driver.findElement(PIZZA_LOCATOR)
                .click();
    }
}