package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

//spy number means sum of digits and product of digits are sum is called spy number
public class Syp_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        int n = num;
        int sum = 0, multi = 1;
        while (num != 0) {
            int d = num % 10;
            sum += d;
            multi *= d;
            num = num / 10;

        }
        if (sum == multi)
            System.out.println(n + " is spy number");
        else
            System.out.println(n + " is not spy number");
    }
}
