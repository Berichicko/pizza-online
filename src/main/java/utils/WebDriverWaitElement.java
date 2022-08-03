package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebDriverWaitElement {

    private WebDriver driver;

    public WebDriverWaitElement(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitWebElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).
                until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public  void clickWaitWebElementIsVisible(By locator) {
        WebElement menu = driver.findElement(locator);
        waitWebElementIsVisible(menu).click();
    }
}
