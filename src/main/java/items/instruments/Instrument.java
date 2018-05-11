package items.instruments;

import items.Item;

public abstract class Instrument extends Item implements IPlay {

    private String material;
    private String colour;
    private InstrumentFamily family;

    public Instrument(String material, String colour, InstrumentFamily family, Double buyPrice, Double sellPrice) {
        super(buyPrice, sellPrice);
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
