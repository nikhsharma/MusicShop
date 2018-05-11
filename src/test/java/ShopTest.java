import items.accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;
import shops.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks sticks;

    @Before
    public void before() throws Exception {
        shop = new Shop("Music Shop");
        sticks = new DrumSticks(5.0, 10.0, "Pair of drum sticks.");
    }

    @Test
    public void hasName() {
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void hasEmptyStock() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        shop.addStock(sticks);
        assertEquals(1, shop.stockCount());
    }
}
