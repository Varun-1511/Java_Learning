//9. To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = in.nextInt();

        for (int i=num1; i<num2; i++ ){
            int OriginalNum, rem, result=0;
            OriginalNum=i;
            while(OriginalNum!=0){
                rem=OriginalNum%10;
                result = result+(rem*rem*rem);
                OriginalNum = OriginalNum/10;
            }
            if(result==i){
                System.out.println(result);
            }
        }
    }
}
