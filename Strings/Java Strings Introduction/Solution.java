// AUTHOR :: RAHUL MISTRY
// DATE   :: 21 / 07 / 2023

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareToIgnoreCase(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s1 = A.substring(0, 1).toUpperCase();
        String s2 = A.substring(1).toLowerCase();
        String s3 = B.substring(0, 1).toUpperCase();
        String s4 = B.substring(1).toLowerCase();
        System.out.println(s1 + s2 + " " + s3 + s4);
        sc.close();
    }
}
