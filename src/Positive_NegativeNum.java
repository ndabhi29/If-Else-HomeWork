import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Positive_NegativeNum {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number:"); // Enter your number & check
        int n =in.nextInt();
                                     // Conditional Statement
        if (n > 0) {
            System.out.println("Number is Positive");
        }
        else if (n < 0) {
            System.out.println("Number is Negative");
            }
            else{
                System.out.println("Number is Zero");
            }

        }

    }




