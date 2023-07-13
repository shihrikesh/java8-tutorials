package psrp.javaProblemSolving.collections;

import java.util.ArrayList;
import java.util.List;

public class Question_6_2 <T extends Number> {
		T t;
		public static void main(String[] args) {
			Question_6_2 q =
			   new Question_6_2<Integer>(); // 1
			q.t = new Float(1); // 2
			System.out.println(q.t);

			//List<? super Object> l3 = new ArrayList<String>();
			List<? super Number> list = new ArrayList<>(); // 1
			list.add(new Integer(2)); // 2
			//list.add(new Object()); // 3
		}
	}