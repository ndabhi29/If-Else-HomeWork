import java.util.Scanner;

public class Studentresult {
    private static Scanner sc;

    public static void main(String[] args) {
        String studentname;
        int Maths, Science, English, Rollno;
        float total, percentage;
        sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        studentname = sc.next();
        System.out.println("Enter student Roll no:");
        Rollno = sc.nextInt();
        System.out.println("Enter Maths marks:");
        Maths = sc.nextInt();
        System.out.println("Enter Science marks:");
        Science = sc.nextInt();
        System.out.println("Enter English marks:");
        English = sc.nextInt();
        total = Maths + Science + English;
        percentage = (total / 300) * 100;

        System.out.println("Total marks = " + total);
        System.out.println(" percentage" + percentage);
        // If student score below 35 marks in any subject overall result will fail.
        if (percentage >= 80) {
            System.out.println(" STUDENT PASS WITH A+ GRADE" + percentage + "%");
        } else if (percentage >= 60) {
            System.out.println("STUDENT PASS WITH A GRADE" + percentage + "%");
        } else if (percentage >= 50) {
            System.out.println("STUDENT PASS WITH B GRADE" + percentage + "%");
        } else if (percentage >= 35) {
            System.out.println("STUDENT PASS WITH C GRADE" + percentage + "%");
        } else {
            System.out.println("Invalid");

        }
    }

}











































