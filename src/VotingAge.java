import java.util.Scanner;

public class VotingAge {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in); // With if else condition
        System.out.println("Please Enter Your Age:");
        int age= scanner.nextInt();
        if (age>=18) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are NOT eligible to vote ");
        }
        }

    }

