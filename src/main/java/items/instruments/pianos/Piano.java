package items.instruments.pianos;

import items.instruments.Instrument;
import items.instruments.InstrumentFamily;

public class Piano extends Instrument {

    private PianoType type;

    public Piano(PianoType type, String material, String colour) {
        super(material, colour, InstrumentFamily.KEYBOARD);
        this.type = type;
    }

    public String play() {
        return "Plink Plonk";
    }

    public PianoType getType() {
        return type;
    }
}
