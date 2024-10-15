import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
}

class Student {
    String name;
    String usn;
    double SGPA;
    Subject[] subjects;
    Scanner sc;

    
    Student() {
        subjects = new Subject[9];
        for (int i = 0; i < 9; i++) {
            subjects[i] = new Subject();
        }
        sc = new Scanner(System.in);
    }

    void getStudentDetails() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjects[i].subjectMarks = sc.nextInt();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            subjects[i].credits = sc.nextInt();
        }
    }

    void computeSGPA() {
        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < 9; i++) {
            int grade = subjects[i].subjectMarks / 10; // Assuming grade is based on marks
            totalGradePoints += grade * subjects[i].credits;
            totalCredits += subjects[i].credits;
        }

        if (totalCredits > 0) {
            SGPA = totalGradePoints / totalCredits;
        } else {
            SGPA = 0;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("SGPA: " + SGPA);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getStudentDetails();
        student.getMarks();
        student.computeSGPA();
        student.display();
    System.out.println("Name:K.AISHWARYA, Usn:1BM23CS129");
    }
}
