import instruments.pianos.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() throws Exception {
        piano = new Piano();
    }

    @Test
    public void canPlay() {
        assertEquals("Plink Plonk", piano.play());
    }
}
