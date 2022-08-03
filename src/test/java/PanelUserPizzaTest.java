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
    public void testIsEnabledPizzaPanelUserOrder() {
        Assert.assertTrue(catalogPizzaPage.isEnabledPizzaPanelUserOrder());
    }

    @Test
    public void testNameCatalogPizzaGetNameUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getCatalogNamePizzaMargarita(),
                catalogPizzaPage.getNamePanelUserOrderPizzaMargarita());
    }

    @Test
    public void testPriceCatalogPizzaGetPriceUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getCatalogPricePizzaMargarita(),
                catalogPizzaPage.getPricePanelNameUserOrder());
    }

    @Test
    public void testPriceMargaritaPizzaGetPriceUserOderPizza() {
        Assert.assertEquals(catalogPizzaPage.getMargaritaPricePanelUserOrder(),
                catalogPizzaPage.getPricePanelNameUserOrder());
    }
}
