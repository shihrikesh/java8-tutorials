package interview.jpmc;

public class JPMC_A {

    /**
     * Find how many valleys are hiker crossed
     * -> Hiker starts at sea level
     * -> D denoted going one step down
     * -> U denotes going one step UP
     * -> ones he goes below sea level , valley starts
     * -> once he goes above sea level valley ends
     *
     * - DDUUUUDDUUDD - 1
     * - DDUUUUDDDDUU - 2
     * - UUDDUUUUDDDD - 0
     * @param args
     */
    public static void main(String[] args) {

        char [] steps = new char[]{'D','D','U','U','U','U','D','D','D','D','U','U'};//new char[]{'D','D','U','U','U','U','D','D','U','U','D','D'};
        int count=0;
        int valleyCrossed=0;
        boolean elevation=false;
        for (char step : steps) {
            if (step == 'D') {
                elevation = false;
                count--;
            } else {
                elevation = true;
                count++;
            }

            if (count == 0 & elevation) {
                valleyCrossed++;
            }

        }


        System.out.println(valleyCrossed);
    }
}
