package items.instruments.guitars;

import items.instruments.Instrument;
import items.instruments.InstrumentFamily;

public class Guitar extends Instrument {
    
    private GuitarType type;

    public Guitar(String material, String colour, GuitarType type) {
        super(material, colour, InstrumentFamily.GUITAR);
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
