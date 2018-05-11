package instruments.guitars;

import instruments.Instrument;

public class Guitar extends Instrument {
    
    private GuitarType type;

    public Guitar(String material, String colour, GuitarType type) {
        super(material, colour);
        this.type = type;
    }

    public String play() {
         return "Twang";
     }

    public GuitarType getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return type.numberOfStrings;
    }
}
