//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

import java.util.Scanner;
public class CalOperation {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int result=0;
        System.out.print("Enter the number a and b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("Enter the Operator(+, -, *, /): ");
        char operator = in.next().trim().charAt(0);
        if(operator== '+' || operator== '-' || operator== '*' || operator== '/'){
            if(operator == '+'){
                result = a+b;
            }
            if(operator == '-'){
                result = a-b;
            }
            if(operator == '*'){
                result = a*b;
            }
            if(operator == '/'){
                result = a/b;
            }
            System.out.println("Result = "+result);
        }
        else{
            System.out.println("Invalid Operator.");
        }
    }
}
