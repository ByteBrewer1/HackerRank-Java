
// AUTHOR :: RAHUL MISTRY
// DATE   :: 16 / 07 / 2023
// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            try {
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }
                if (n >= -2147483648 && n <= 2147483647) {
                    System.out.println("* int");
                }
                if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.nextLine() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}