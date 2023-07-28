
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();
        n = n.toLowerCase();
        m = m.toLowerCase();
        char N[] = n.toCharArray();
        char M[] = m.toCharArray();
        Arrays.sort(N);
        Arrays.sort(M);
        if (Arrays.equals(N, M)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
}