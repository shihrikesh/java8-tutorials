package psrp.javaProblemSolving.collections;

import java.util.ArrayList;
import java.util.List;

public class Question_6_1 {
		public static void main(String[] args) {
			Question_6_1 q = new Question_6_1();
			List<Integer> l = new ArrayList<>();
			l.add(20);
			l.add(30);
			q.m1(l);
		}
		private void m1(List<?> l) {
			m2(l); // 1
		}
		private <T> void m2(List<T> l) {
			l.set(1, l.get(0)); // 2
			System.out.println(l);
		}
	}