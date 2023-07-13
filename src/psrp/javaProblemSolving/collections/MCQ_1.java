package psrp.javaProblemSolving.collections;

import java.util.*;

public class MCQ_1 {

    public static void main(String[] args) {
        List<String> list = new Vector<String>();

        //List<Object> values = new HashSet<Object>();

        //List<Object> objects = new ArrayList<? extends Object>();

        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
        //HashSet<Number> hs = new HashSet<Integer>();

        Comparator<Integer> c = (o1, o2) -> o2-o1;
        List<Integer> list1 = Arrays.asList(5, 4, 7, 1);
        Collections.sort(list1, c);
        System.out.println(Collections.binarySearch(list1, 1));

        // if use Queue, we get 10,12, if List, we get 10.
        Queue<Integer> q = new LinkedList<>();
        //List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        //q.remove(1);  // in queue doesn't remove
        q.remove();  // removes first element from head
        System.out.print(q);

        // hash map, can add different types of keys

        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.entrySet());
        System.out.println(m.containsKey("123"));

        // set print
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        s.forEach(System.out::println);
        //System.out.println(s);


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, Integer::sum);
        map.merge(3, 3, (a,b) -> a + b);
        System.out.println(map);
    }
}
