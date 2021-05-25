package lambda;

import lombok.Data;

@Data
public class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }

}
