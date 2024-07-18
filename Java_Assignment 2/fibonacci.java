//7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int a=0;
        int b=1;
        int count =0;
        int temp =0;
        while(count<=num){
            System.out.print(temp+" ");
            temp = b;
            b= b+a;
            a=temp;
            count++;
        }
    }
}
