package instruments.pianos;

import instruments.Instrument;

public class Piano extends Instrument {

    private PianoType type;

    public Piano(String material, PianoType type) {
        super(material);
        this.type = type;
    }

    public String play() {
        return "Plink Plonk";
    }

    public PianoType getType() {
        return type;
    }
}
