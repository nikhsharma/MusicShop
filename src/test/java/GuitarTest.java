import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() throws Exception {
        guitar = new Guitar();
    }

    @Test
    public void canPlay() {
        assertEquals("Twang", guitar.play());
    }
}
