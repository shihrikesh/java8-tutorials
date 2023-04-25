package strings;

public class EnumChecker {

    public static void main(String[] args) {
        Cereals cereals = Cereals.CAPTAIN_CRUNCH;
        System.out.println(cereals);

        for(Cereals cer : Cereals.values()){
            System.out.println(cer);
        }

        System.out.println(IceCream.TUTTI_FRUITY.levelOfDeliciousNess);
    }
}
