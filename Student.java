import java.util.*;

class Student {
    String name;
    int id;
    String department;
    int age;

    static String collegeName = "Prince Engineering College";

    Student() {}

    Student(String name, int id, String department, int age) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.age = age;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("College     : " + collegeName);
        System.out.println("Department  : " + department);
        System.out.println("Age         : " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, id, dept, age);
        }

        System.out.println("\n===== Student Records =====");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}---