package sectionRecord;

public class Main {
    public static void main(String[] args) {

        // create 5 Student obj & passing a starting id + i so each student has a diff id
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    // will give us a diff name based on the value of the loop index i
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anon";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        // setter for pojo class.
        // the record class doesn't have setters bc if u need to modify ur data u won't be using the record class
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        // getters for pojo and record class
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
