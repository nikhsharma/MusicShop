package instruments;

public abstract class Instrument {

    private String material;

    public Instrument(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
