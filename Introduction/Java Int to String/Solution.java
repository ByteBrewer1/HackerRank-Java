
// AUTHOR :: RAHUL MISTRY
// DATE   :: 16 / 07 / 2023

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= -100 || n <= 100) {
            // String m = String.valueOf(n);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
