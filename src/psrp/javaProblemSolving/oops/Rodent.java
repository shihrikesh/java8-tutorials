package psrp.javaProblemSolving.oops;

public class Rodent {
	 protected static Integer chew() throws Exception {
	 System.out.println("Rodent is chewing");
	 return 1;
	 }
	}
	// below class issue with return type of method chew() and overriding chew method
	/*public class Beaver extends Rodent {
	 public Number chew() throws RuntimeException {
	 System.out.println("Beaver is chewing on wood");
	 return 2;
	 }
	}*/