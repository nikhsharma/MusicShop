package instruments;

public class Guitar {
    
    GuitarType type;

    public Guitar(GuitarType type) {
        this.type = type;
    }

    public String play() {
         return "Twang";
     }

    public GuitarType getType() {
        return type;
    }
}
