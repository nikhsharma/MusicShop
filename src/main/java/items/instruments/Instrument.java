package items.instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentFamily family;

    public Instrument(String material, String colour, InstrumentFamily family) {
        this.material = material;
        this.colour = colour;
        this.family = family;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentFamily getFamily() {
        return family;
    }
}
