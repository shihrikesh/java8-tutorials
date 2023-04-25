package strings;

public enum IceCream {
    CHOCOLATE(40),
    BUTTER_SCOTCH(20),
    VANILLA(60),
    TUTTI_FRUITY(65),
    NUTTY(80);

    // need to be final variable
    final int levelOfDeliciousNess;

    IceCream(int levelOfDeliciousNess){
        this.levelOfDeliciousNess = levelOfDeliciousNess;
    }
}
