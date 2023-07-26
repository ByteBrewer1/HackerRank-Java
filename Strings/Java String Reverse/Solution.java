
// AUTHOR :: RAHUL MISTRY
// DATE   :: 26 / 07 / 2023
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int haft_length = A.length() / 2;
        boolean is_palindrome = true;
        for (int i = 0; i <= haft_length; i++) {
            if (A.charAt(i) == A.charAt(A.length() - i - 1)) {
                continue;
            } else {
                is_palindrome = false;
                break;
            }
        }
        if (is_palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

}