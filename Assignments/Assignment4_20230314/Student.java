import java.util.Scanner;

public class Student {
    Scanner scan = new Scanner(System.in);
    String name;
    int age;
    Mark mark = new Mark();

    public void readDetails() {
        System.out.println("Enter the name of student");
        name = scan.next();
        System.out.println("Enter the age of student");
        age = scan.nextInt();
        readMark();
    }

    public void readMark() {
    	
        System.out.println("Enter the marks of English");
        mark.englishMark = scan.nextInt();
        System.out.println("Enter the marks of Maths");
        mark.mathsMark = scan.nextInt();
        System.out.println("Enter the marks of Physics");
        mark.physicsMark = scan.nextInt();
        System.out.println("Enter the marks of Chemistry");
        mark.chemistryMark = scan.nextInt();
    }

    public float avgMark() {
        return (mark.englishMark + mark.mathsMark + mark.physicsMark + mark.chemistryMark) / 4.0f;
    }
}