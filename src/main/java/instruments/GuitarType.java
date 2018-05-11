package instruments;

public enum GuitarType {

    ELECTRICSIXSTRING(6),
    ACOUSTICSIXSTRING(6),
    ELECTRICTWELVESTRING(12),
    ACOUSTICWELVESTRING(12),
    ELECTRICBASS(4),
    ACOUSTICBASS(4);

    int numberOfStrings;

    GuitarType(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
