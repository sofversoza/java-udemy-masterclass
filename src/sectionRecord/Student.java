package sectionRecord;
// POJO -- Plain Old Java Object (used to house & pass data between functional classes)
    // could also be referred to as bean or JavaBean (+ rules applied to it)
    // or an Entity (bc it mirrors database entities)
    // or DTO -- Data Transfer Object (an obj that can be modeled as just data)

// The Entity -- The Student Table
public class Student {
    private String id;
    private String name;
    private String dob;
    private String classList;

    public Student(String id, String name, String dob, String classList) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
