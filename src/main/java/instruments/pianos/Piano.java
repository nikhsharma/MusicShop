package instruments.pianos;

import instruments.Instrument;

public class Piano extends Instrument {

    private PianoType type;

    public Piano(String material, String colour, PianoType type) {
        super(material, colour);
        this.type = type;
    }

    public String play() {
        return "Plink Plonk";
    }

    public PianoType getType() {
        return type;
    }
}
