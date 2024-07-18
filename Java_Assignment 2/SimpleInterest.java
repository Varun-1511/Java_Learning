//3. Write a program to input principal, time, and rate (P, T, R) from the user
// and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal(P): ");
        int p = in.nextInt();
        System.out.print("Enter the Time(T - in Years): ");
        int t = in.nextInt();
        System.out.print("Enter the Rate(R - in %): ");
        int r = in.nextInt();

        int SI = (p*t*r)/100;
        System.out.println("SI is "+SI);

    }
}
