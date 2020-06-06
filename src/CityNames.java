import java.util.Scanner;

public class CityNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch; // local variable
        System.out.println("Enter any Alphabet:");
        ch = scanner.next().charAt(0);
        if (ch == 'a') {                       //If else Statement
            System.out.println("AMDAWAD");
        } else if (ch == 'b') {
            System.out.println("BARODA");
        } else if (ch == 'c') {
            System.out.println("CULCUTTA");
        } else if (ch == 'd') {
            System.out.println("DELHI");
        } else if (ch == 'e') {
               System.out.println("ELORA");
        }
        else if(ch=='f'){
            System.out.println("FARIDABAD");

        }
    }
}