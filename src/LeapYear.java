import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter any Year: ");
        int year = Scanner.nextInt(); //Leap Year divisible by4and400 not by 100
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }
    }
}