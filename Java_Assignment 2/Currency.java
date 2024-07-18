//6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        System.out.print("Enter the Amount in Rupees: ");
        double a= in.nextDouble();

        double b = a*0.012;
        System.out.println(a+" rupees is = "+b+" dollars");
    }
}
