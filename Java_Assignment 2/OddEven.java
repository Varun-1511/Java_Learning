//1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int a = in.nextInt();

        if(a%2==0){
            System.out.println("The integer is Even");
        }
        else{
            System.out.println("The integer is odd");
        }
    }
}
