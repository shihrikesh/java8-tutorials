package sorting;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaxInMap {

    public static void main(String[] args) {
        Map<String,Integer> coursePrice = new HashMap<>();
        coursePrice.put("Java",5000);
        coursePrice.put("Python",3000);
        coursePrice.put("CPP",4000);
        coursePrice.put("Android",8000);

        System.out.println(Collections.max(coursePrice.values()));
        System.out.println(coursePrice.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }
}
