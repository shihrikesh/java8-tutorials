package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PatientGroupBy {

    public static void main(String[] args) {
        Patient patient = new Patient(1,"hrishi", "rewa", HealthStatus.MODERATE);
        Patient patient1 = new Patient(2,"shyam", "rewa", HealthStatus.NORMAL);
        Patient patient2 = new Patient(3,"ram", "satna", HealthStatus.SEVERE);
        Patient patient3 = new Patient(4,"arun", "delhi", HealthStatus.MODERATE);
        Patient patient4 = new Patient(5,"varun", "chennai", HealthStatus.NORMAL);
        Patient patient5 = new Patient(6,"karuna", "hyd", HealthStatus.MODERATE);

        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient);
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);

        patientList.forEach(System.out::println);

        //group by unique key
        Map<Integer, Patient> patientMapUniqueId = patientList.stream()
                .collect(Collectors.toMap(Patient::getId,Function.identity()));
        System.out.println("********** Group By Unique Id ************");
        System.out.println(patientMapUniqueId);
        System.out.println();

        // group by region

        Map<String,List<Patient>> patientMap = patientList.stream()
                .collect(Collectors.groupingBy(Patient::getRegion));

        System.out.println("********** Group by Region ************");
        patientMap.forEach((key, value) -> System.out.println("key is: "+ key + "and  value is: "+ value));
        System.out.println();

       // sorted by name

        List<Patient> patientNameSorted = patientList.stream()
                .sorted(Comparator.comparing(Patient::getName))
                .collect(Collectors.toList());

        System.out.println("********** Sorted By Name ************");
        patientNameSorted.forEach(System.out::println);
        System.out.println("");


        // sorted by Id

        List<Patient> patientIdSorted = patientList.stream()
                .sorted(Comparator.comparing(Patient::getId))
                .collect(Collectors.toList());

        System.out.println("********** Sorted By ID ************");
        patientIdSorted.forEach(System.out::println);
        System.out.println("");


        // Sorted and Optional
        Optional<String> optionalString = patientList.stream()
                .max(Comparator.comparing(Patient::getId))
                .map(Patient::getName);

        System.out.println("********** Sorted By ID and optional with MAX ************");
        optionalString.ifPresent(System.out::println);

        // filter

        List<Patient> patientByHealthStatus = patientList.stream()
                .filter(p -> p.getHealthStatus() == HealthStatus.SEVERE)
                .collect(Collectors.toList());

        System.out.println("********** Filter By HealthStatus ************");
        patientByHealthStatus.forEach(System.out::println);

        // map

        List<String> patientByMap = patientList.stream()
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("********** Map to UpperCase ************");
        patientByMap.forEach(System.out::println);

        // flat map

        List<String> apple = Arrays.asList("Apple");
        List<String> orange = Arrays.asList("Orange");
        List<String> guava = Arrays.asList("Guava");
        List<String> grapes = Arrays.asList("Grapes");
        List<List<String>> fruitList = new ArrayList<>();
        fruitList.add(apple);
        fruitList.add(orange);
        fruitList.add(guava);
        fruitList.add(grapes);

        List<String> fruitListStream = fruitList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("********** Flat map to get List ************");
        fruitListStream.forEach(System.out::println);
    }
}
