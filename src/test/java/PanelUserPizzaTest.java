import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class PanelUserPizzaTest extends BaseTest {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    private TerraPizzaHomePage terraPizzaHomePage;
    private CatalogPizzaPage catalogPizzaPage;

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
    public void testIsDisplayedPizzaMargarita() {
        Assert.assertTrue(catalogPizzaPage.isDisplayedPizzaMargarita());
    }

    @Test
    public void testIsDisplayedPanelUserOrder() {
        Assert.assertTrue(catalogPizzaPage.isDisplayedPanelUserOrder());
    }

    @Test
    public void testIsDisplayedPizzaPanelUserOrder() {
        Assert.assertTrue(catalogPizzaPage.isDisplayedPizzaPanelUserOrder());
    }

    @Test
    public void testNameCatalogPizzaGetNameUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getNameCatalogPizzaMargarita(), catalogPizzaPage.getNameUserPanelOrderPizzaMargarita());
    }

    @Test
    public void testPriceCatalogPizzaGetPriceUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getPriceCatalogPizzaMargarita(), catalogPizzaPage.getPriceUserPanelOrderPizzaMargarita());
    }
}
