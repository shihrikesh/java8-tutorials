package classroom;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapIterationExercise1 {

    public static void main(String[] args) {
        Map<String,Integer> coursePrices = new HashMap<>();

        coursePrices.put("Java", 5000);
        coursePrices.put("Python", 3000);
        coursePrices.put("CPP", 4000);
        coursePrices.put("Android", 8000);

        Integer max = Collections.max(coursePrices.values());
        System.out.println(Collections.max(coursePrices.values()));

        String key = coursePrices.entrySet().stream().map(Map.Entry::getKey)
                .filter(k-> Objects.equals(max, coursePrices.get(k))).toList().get(0);

        System.out.println("key is " + key + " value " + max);
    }

}
