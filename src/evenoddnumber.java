import java.util.Scanner;

public class evenoddnumber {

    public static void main(String[] args)//Using ternary operator for even odd number.
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
          int number = scanner.nextInt();
          String result = ( number%2==0)? "even number":"odd number";
          System.out.println(result);



    }
}