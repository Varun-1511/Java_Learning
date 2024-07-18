//5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers a and b: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int c = Math.max(a,b);
        System.out.println("The largest number is: "+c);
    }
}
