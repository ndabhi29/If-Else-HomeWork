import java.util.Scanner;

public class Number_Symbol {
              //You can do Add,Sub,Multi,Div.
    public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter First Number");
        int num1=scanner.nextInt();

        System.out.println("Please Enter Second Number");// Enter Arithmetic symbol as per method
        int num2=scanner.nextInt();
        System.out.println("Please Enter Arithmetic Symbol from +,*,/,-");
        String symbol = scanner.next();
        System.out.println("Symbol+symbol");
        int result =0;
        if  (symbol.equals("+"))
        {   result=num1+num2;
            System.out.println("Addition of :"+num1+"and"+num2+"="+result);
        }
        else if
            (symbol.equals("-")){
           result=num1-num2;
            System.out.println("Subtraction of :"+num1+"and"+num2+"="+result); }

        else if
            (symbol.equals("*")){
            result=num1*num2;
            System.out.println("Multiplication of :"+num1+"and"+num2+"="+result);}
         else if
        (symbol.equals("/"))
         { result=num1/num2;
             System.out.println("Division of:"+num1+ "and" +num2+ "="+  result);
         }

    }

}







