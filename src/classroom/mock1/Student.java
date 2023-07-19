package classroom.mock1;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;
    private String course;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("John", 22, "Math"),
                new Student("Sarah", 20, "English"),
                new Student("Mike", 24, "Computer Science"), 
                new Student("Emily", 21, "Math"),
                new Student("David", 23, "Computer Science"));
        
        // indentify oldest student for each course

        System.out.println( " print oldest employee in each department");
        students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.maxBy(Comparator.comparingInt(Student::getAge))))
                .values().stream()
                .map(obj-> obj.map(student -> new Student(student.name.toUpperCase(), student.age, student.course)))
                        .collect(Collectors.toList()).forEach(System.out::println);

        students.stream().map(student -> {
            student.setName(student.name.toUpperCase());
            return student;
        }).collect(Collectors.groupingBy(Student::getCourse,
                Collectors.maxBy(Comparator.comparingInt(Student::getAge))))
                .forEach((k,v)-> System.out.println("Course "+ k + " oldest student " + v));



        System.out.println( " print student object with uppercase ");
        // optional s=chaing parameter
        System.out.println(students.stream()
                .map(obj -> new Student(obj.name.toUpperCase(), obj.getAge(), obj.course))
                .max(Comparator.comparingInt(Student::getAge)).orElseThrow(NoSuchFieldError::new));

        // statefull and staeless
        
        
    }
}