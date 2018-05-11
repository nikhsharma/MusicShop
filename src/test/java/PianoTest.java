import items.instruments.InstrumentFamily;
import items.instruments.pianos.Piano;
import items.instruments.pianos.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() throws Exception {
        piano = new Piano(PianoType.GRAND, "Wood", "Black", 5.0, 10.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Plink Plonk", piano.play());
    }

    @Test
    public void hasType() {
        assertEquals(PianoType.GRAND, piano.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasInstrumentFamily() {
        assertEquals(InstrumentFamily.KEYBOARD, piano.getFamily());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.0, piano.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10.0, piano.getSellPrice(), 0.1);
    }
}
