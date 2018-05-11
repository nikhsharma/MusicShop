import items.accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    GuitarStrings strings;

    @Before
    public void before() throws Exception {
        strings = new GuitarStrings(5.0, 10.0, "Ernie Ball 9's");
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.0, strings.getBuyPrice(),0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10.0, strings.getSellPrice(),0.1);
    }

    @Test
    public void hasDescription() {
        assertEquals("Ernie Ball 9's", strings.getDescription());
    }
}
