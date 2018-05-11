import instruments.pianos.Piano;
import instruments.pianos.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() throws Exception {
        piano = new Piano(PianoType.GRAND);
    }

    @Test
    public void canPlay() {
        assertEquals("Plink Plonk", piano.play());
    }

    @Test
    public void hasType() {
        assertEquals(PianoType.GRAND, piano.getType());
    }
}
