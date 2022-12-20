package sectionOOP.pojo;

// Plain Old Java Object
public class Main {
    public static void main(String[] args) {

        // creating 5 Student instances using a for loop
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Time";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anon";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        // pojo class
        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");

        // record class
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}
