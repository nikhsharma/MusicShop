import instruments.Guitar;
import instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() throws Exception {
        guitar = new Guitar(GuitarType.ELECTRICSIXSTRING);
    }

    @Test
    public void canPlay() {
        assertEquals("Twang", guitar.play());
    }

    @Test
    public void hasType() {
        assertEquals(GuitarType.ELECTRICSIXSTRING, guitar.getType());
    }
}
