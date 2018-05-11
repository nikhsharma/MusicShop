import org.junit.Before;
import org.junit.Test;
import shops.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before() throws Exception {
        shop = new Shop("Music Shop");
    }

    @Test
    public void hasName() {
        assertEquals("Music Shop", shop.getName());
    }
}
