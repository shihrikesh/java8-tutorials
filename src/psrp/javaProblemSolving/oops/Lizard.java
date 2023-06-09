package psrp.javaProblemSolving.oops;

abstract class Reptile {
 // below method is final
 // getting issue while overriding  layEggs method
 public final void layEggs() { System.out.println("Reptile laying eggs");
 }
 public static void main(String[] args) {
 Reptile reptile = new Lizard();
 reptile.layEggs();
 }
 }
 public class Lizard extends Reptile {
 // uncomment to see

 //public void layEggs() { System.out.println("Lizard laying eggs"); }
 }