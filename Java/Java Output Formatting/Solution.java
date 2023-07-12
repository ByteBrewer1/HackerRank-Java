
// AUTHOR :: RAHUL MISTRY
// DATE   :: 12 / 07 / 2023

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int num1 = sc.nextInt();
        String name2 = sc.next();
        int num2 = sc.nextInt();
        ;
        String name3 = sc.next();
        int num3 = sc.nextInt();

        System.out.println("================================");
        System.out.printf("%-15s%03d\n", name1, num1);
        System.out.printf("%-15s%03d\n", name2, num2);
        System.out.printf("%-15s%03d\n", name3, num3);
        System.out.println("================================");
        sc.close();
    }
}
