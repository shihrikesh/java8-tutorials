package psrp.javaProblemSolving.multiThreading;

public class Task2 {

    // Permutations from a string.
    //Input is: ABC
    //Output is:
    //              ABC ACB
    //              BAC BCA
    //              CBA CAB

    public static void main(String[] args) {
        String str = "ABC";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(chars[i]);
        }
    }
}
