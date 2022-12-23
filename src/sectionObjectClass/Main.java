package sectionObjectClass;

public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carol");
        System.out.println(jimmy);
    }
}

// this class inherits from Object implicitly
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}


// inherits from Student class^^
class PrimarySchoolStudent extends Student {

    // field unique for PrimarySchoolStudent
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        // to call Students constructor
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}