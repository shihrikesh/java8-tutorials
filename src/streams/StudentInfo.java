package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StudentInfo {

    private String id;
    private String name;
    private Double score;
    private String subStream;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getSubStream() {
        return subStream;
    }

    public void setSubStream(String subStream) {
        this.subStream = subStream;
    }

    public StudentInfo(String id, String name, Double score, String subStream) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.subStream = subStream;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", subStream='" + subStream + '\'' +
                '}';
    }

    public static void main(String[] args) throws NoSuchFieldException {
        List<StudentInfo> studentInfoList = new ArrayList<>();

        studentInfoList.add(new StudentInfo("23","hari", 89.3, "Commerce"));
        studentInfoList.add(new StudentInfo("28","rishi", 79.3, "PCM"));
        studentInfoList.add(new StudentInfo("26","shikha", 78.6, "BIO"));
        studentInfoList.add(new StudentInfo("59","isha", 98.6, "Commerce"));
        studentInfoList.add(new StudentInfo("68","esha", 76.3, "PCM"));
        studentInfoList.add(new StudentInfo("86","jagan", 78.3, "BIO"));
        studentInfoList.add(new StudentInfo("49","mahendra", 67.3, "Commerce"));

        // statistical value
        System.out.println(studentInfoList.stream().collect(Collectors.averagingDouble(stu-> stu.score)));

        DoubleSummaryStatistics summaryStatistics = studentInfoList.stream()
                .collect(Collectors.summarizingDouble(stu-> stu.score));

        System.out.println(summaryStatistics);

        // group by subjects and student

        studentInfoList
                .stream()
                .collect(Collectors.groupingBy(StudentInfo::getSubStream))
                .forEach((k,v)-> System.out.println(" key is " + k + " value is "+ v));

        // grouping bu subject and mapping by Score

        studentInfoList
                .stream()
                .collect(Collectors.groupingBy(StudentInfo::getSubStream, TreeMap::new,
                        Collectors.mapping(StudentInfo::getScore, Collectors.toSet()) ))
                .forEach((k,v)-> System.out.println(" key is " + k + " value is "+ v));


        // mapping names

        studentInfoList.stream().map(StudentInfo::getName).collect(Collectors.toList()).forEach(System.out::println);

        // joinning

        System.out.println(studentInfoList.stream().map(StudentInfo::getName).collect(Collectors.joining("::")));

        System.out.println(studentInfoList.stream().map(StudentInfo::getName).collect(Collectors.joining(",", "Mr ", " hello")));

        // get double

        OptionalDouble od = OptionalDouble.of(0);
        System.out.println(studentInfoList.stream().mapToDouble(st -> st.score).average().orElseThrow(NoSuchFieldException::new));
        System.out.println(studentInfoList.stream().mapToDouble(st -> st.score).average().orElse(0.0));
        //check this
        // System.out.println(studentInfoList.stream().mapToDouble(st -> st.score).average().orElseGet());

        studentInfoList.stream()
                .filter(studentInfo -> studentInfo.subStream.equalsIgnoreCase("PCM"))
                .mapToDouble(st-> st.score*0.1).forEach(System.out::println);



    }
}
