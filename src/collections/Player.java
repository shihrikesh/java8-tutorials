package collections;

import java.util.Objects;

public class Player {

    private String name;
    private Integer ranking;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                ", age=" + age +
                '}';
    }

    public Player(String name, Integer ranking, int age) {
        this.name = name;
        this.ranking = ranking;
        this.age = age;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
