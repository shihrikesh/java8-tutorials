package psrp.javaProblemSolving.oops;

interface HasExoskeleton {
 abstract int getNumberOfSections();
 }
 abstract class Insect implements HasExoskeleton {
 abstract int getNumberOfLegs();
 }
 // below class must be declared abstract or implement method from interface
 /*public class Beetle extends Insect {
 int getNumberOfLegs() { return 6; }
 }*/