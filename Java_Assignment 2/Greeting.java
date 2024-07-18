//2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String a = in.nextLine();
        System.out.println("Hi "+a+"! Welcome, Have a nice Day!");

    }
}
