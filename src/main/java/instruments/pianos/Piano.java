package instruments.pianos;

public class Piano {
    PianoType type;

    public Piano(PianoType type) {
        this.type = type;
    }

    public String play() {
        return "Plink Plonk";
    }

    public PianoType getType() {
        return type;
    }
}
