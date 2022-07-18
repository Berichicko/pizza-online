import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class PanelUserPizzaTest extends BaseTest{
    private TerraPizzaHomePage terraPizzaHomePage;
    private CatalogPizzaPage catalogPizzaPage;
    JavascriptExecutor executor = (JavascriptExecutor) driver;


    @Before
    public void testOpenPage() {
        terraPizzaHomePage = new TerraPizzaHomePage(driver);
        catalogPizzaPage = new CatalogPizzaPage(driver);
        terraPizzaHomePage.clickCatalogPizza();
        executor.executeScript("window.scrollBy(0,500)", "");
        catalogPizzaPage.clickButtonChoosePizzaMargarita();
        catalogPizzaPage.clickPanelUserOrderProduct();

    }

    @Test
    public void testAvailabilityPizzaUserPanelOrder () {
        Assert.assertTrue(terraPizzaHomePage.isDisplayedCatalogPizza());
        Assert.assertTrue(catalogPizzaPage.isDisplayedPizzaMargarita());
        Assert.assertTrue(catalogPizzaPage.isDisplayedButtonChoosePizzaMargarita());
        Assert.assertTrue(catalogPizzaPage. isDisplayedPanelUserOrder());
        Assert.assertTrue(catalogPizzaPage.isDisplayedPizzaPanelUserOrder());
        Assert.assertTrue(catalogPizzaPage.isDisplayedNamePizzaPanelUserOrder());
        Assert.assertTrue(catalogPizzaPage.isDisplayedSizePizzaPanelUserOrder());
        Assert.assertTrue(catalogPizzaPage.isDisplayedWeightPizzaPanelUserOrder());
        Assert.assertTrue(catalogPizzaPage.isDisplayedPricePizzaPanelUserOrder());
        Assert.assertTrue(catalogPizzaPage.isDisplayedAmountPizzaPanelUserOrder());



    }

}
