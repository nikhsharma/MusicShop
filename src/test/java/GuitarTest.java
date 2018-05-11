import items.instruments.InstrumentFamily;
import items.instruments.guitars.Guitar;
import items.instruments.guitars.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() throws Exception {
        guitar = new Guitar("Wood", "White", GuitarType.ELECTRICSIXSTRING, 5.0, 10.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Twang", guitar.play());
    }

    @Test
    public void hasType() {
        assertEquals(GuitarType.ELECTRICSIXSTRING, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("White", guitar.getColour());
    }

    @Test
    public void hasFamily() {
        assertEquals(InstrumentFamily.GUITAR, guitar.getFamily());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.0, guitar.getBuyPrice(), 0.1);
    }
}
