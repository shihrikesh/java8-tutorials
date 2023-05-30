package core;

public final class ImmutableStudent {

    // Making all member variable private final
    // No setter
    // deep cloning using constructor
    // passing cloned data from any getter if non immutable
    private final int id;
    private final String name;

    // Mutable object
    private final Age age;

    public ImmutableStudent(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age copyAge = new Age();
        copyAge.setDay(age.getDay());
        copyAge.setMonth(age.getMonth());
        copyAge.setYear(age.getYear());
        this.age = copyAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }
}

