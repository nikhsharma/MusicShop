package instruments.guitars;

import instruments.Instrument;

public class Guitar extends Instrument {
    
    private GuitarType type;

    public Guitar(GuitarType type) {
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
