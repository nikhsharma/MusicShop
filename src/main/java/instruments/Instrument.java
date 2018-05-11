package instruments;

public abstract class Instrument {

    private String material;
    private String colour;

    public Instrument(String material, String colour) {
        this.material = material;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
