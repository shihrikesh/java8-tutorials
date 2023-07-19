package interview.cts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        // iterate hashmap using while loop

        Map<String, String> map = new HashMap<>();
        map.put("1", "hello");
        map.put("2", "hello1");
        map.put("3", "hello2");
        map.put("4", "hello3");

        // while
        map.entrySet().forEach(System.out::println);

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(" key " + entry.getKey()+ " value " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(" key " + entry.getKey() + " value " + entry.getValue());
        }
    }
}
