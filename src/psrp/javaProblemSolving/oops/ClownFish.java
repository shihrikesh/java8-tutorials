package psrp.javaProblemSolving.oops;

interface Aquatic {
 // need to implement getNumberOfGills with correct return type
 public default int getNumberOfGills(int input) { return 2; }
 }
 public class ClownFish implements Aquatic {
 public String getNumberOfGills() { return "4"; }
     // uncomment below
 //public String getNumberOfGills(int input) { return "6"; }
 public static void main(String[] args) {
 System.out.println(new ClownFish().getNumberOfGills(-1));
 }
 }