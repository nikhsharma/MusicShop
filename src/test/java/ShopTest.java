import items.accessories.DrumSticks;
import items.instruments.guitars.Guitar;
import items.instruments.guitars.GuitarType;
import org.junit.Before;
import org.junit.Test;
import shops.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks sticks;
    Guitar guitar;

    @Before
    public void before() throws Exception {
        shop = new Shop("Music Shop");
        guitar = new Guitar("Wood", "Black", GuitarType.ACOUSTICSIXSTRING, 5.0, 10.0, "Black acoustic guitar.");
        sticks = new DrumSticks(2.0, 5.0, "Pair of drum sticks.");
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

    @Test
    public void canRemoveStock() {
        shop.addStock(sticks);
        shop.addStock(guitar);
        shop.removeStock(sticks);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addStock(sticks);
        shop.addStock(guitar);
        assertEquals(8.0, shop.calculateTotalPotentialProfit(), 0.1);
    }

    @Test
    public void canSellProduct() {
        shop.addStock(sticks);
        shop.addStock(guitar);
        shop.sellProduct(sticks);
        assertEquals(1, shop.stockCount());
        assertEquals(1, shop.soldCount());
    }

    @Test
    public void canCalculateProfit() {
        shop.addStock(sticks);
        shop.addStock(guitar);
        shop.sellProduct(sticks);
        shop.sellProduct(guitar);
        assertEquals(8.0, shop.calculateTotalProfit(), 0.1);
    }

    @Test
    public void canGetMoney() {
        assertEquals(0.0, shop.getMoney(), 0.1);
    }

    @Test
    public void canAddToMoney() {
        shop.addToMoney(10.0);
        assertEquals(10.0, shop.getMoney(), 0.1);
    }

    @Test
    public void canWithdrawMoney() {
        shop.addToMoney(10.0);
        assertEquals(5.0, shop.withdrawMoney(5.0), 0.1);
        assertEquals(5.0, shop.getMoney(), 0.1);
    }

    @Test
    public void hasEndOfDayMethod() {
        shop.addStock(sticks);
        shop.addStock(guitar);
        shop.sellProduct(sticks);
        assertEquals(5.0, shop.endOfDay(), 0.1);
        assertEquals(0, shop.soldCount());
        assertEquals(1, shop.stockCount());
        assertEquals(5.0, shop.getMoney(), 0.1);
    }

    @Test
    public void cantSellProductIfNotInStock() {
        shop.addStock(sticks);
        shop.sellProduct(sticks);
        shop.sellProduct(sticks);
        assertEquals(1, shop.soldCount());
        assertEquals(0, shop.stockCount());
    }


}
