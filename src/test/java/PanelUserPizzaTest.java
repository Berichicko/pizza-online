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
        terraPizzaHomePage.clickCloseWindowCookie();
        terraPizzaHomePage.clickCatalogPizza();
        executor.executeScript("window.scrollBy(0,500)", "");
        catalogPizzaPage.clickButtonChoosePizzaMargarita();
        catalogPizzaPage.clickPanelUserOrderProduct();
    }



    @Test
    public void isEnabledCatalogPizza() {
        Assert.assertTrue(terraPizzaHomePage.isEnabledCatalogPizza());
    }

    @Test
    public void testIsDisplayedPizzaMargarita() {
        Assert.assertTrue(catalogPizzaPage.isEnabledPizzaMargarita());
    }

    @Test
    public void testIsDisplayedPanelUserOrder() {
        Assert.assertTrue(catalogPizzaPage.isEnabledPanelUserOrder());
    }

    @Test
    public void testIsDisplayedPizzaPanelUserOrder() {
        Assert.assertTrue(catalogPizzaPage.isEnabledPizzaPanelUserOrder());
    }

    @Test
    public void testNameCatalogPizzaGetNameUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getNameCatalogPizzaMargarita(),
                catalogPizzaPage.getNameUserPanelOrderPizzaMargarita());
    }

    @Test
    public void testPriceCatalogPizzaGetPriceUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getPriceCatalogPizzaMargarita(),
                catalogPizzaPage.getPriceUserPanelOrderPizzaMargarita());
    }


    @Test
    public void testDefaultPriceMargaritaGetPriceUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getDefaultPriceUserPanelOrderPizzaMargarita(),
                catalogPizzaPage.getPriceUserPanelOrderPizzaMargarita());
    }
}
