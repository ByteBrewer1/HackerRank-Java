// AUTHOR :: RAHUL MISTRY
// DATE   :: 16 / 07 / 2023

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {
                a += Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}