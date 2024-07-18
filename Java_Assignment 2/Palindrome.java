//8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = in.nextLine().trim();
        String reverse="";
        int length =a.length();
        for(int i=length-1; i>=0 ;i--) {
            reverse = reverse + a.charAt(i);
        }
        if(a.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
