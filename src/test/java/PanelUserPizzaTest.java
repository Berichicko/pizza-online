import org.junit.Assert;
import org.junit.Test;

public class PanelUserPizzaTest extends BaseTest {

    @Test
    public void testIsEnabledCatalogPizza() {
        Assert.assertTrue(terraPizzaHomePage.isEnabledCatalogPizza());
    }

    @Test
    public void testIsEnabledPizzaMargarita() {
        Assert.assertTrue(catalogPizzaPage.isEnabledPizzaMargarita());
    }

    @Test
    public void testIsEnabledPanelUserOrder() {
        Assert.assertTrue(catalogPizzaPage.isEnabledPanelUserOrder());
    }

    @Test
    public void testIsEnabledPizzaPanelUserOrder() {
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
    public void testPriceMargaritaPizzaGetPriceUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getDefaultPriceUserPanelOrderPizzaMargarita(),
                catalogPizzaPage.getPriceUserPanelOrderPizzaMargarita());
    }
}
