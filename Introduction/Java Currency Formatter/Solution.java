
// AUTHOR :: RAHUL MISTRY
// DATE   :: 17 / 07 / 2023

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale[] locale = { Locale.US, new Locale("en", "IN"), Locale.CHINA, Locale.FRANCE };
        String[] place = { "US", "India", "China", "France" };

        for (int i = 0; i < locale.length; i++) {
            String money = NumberFormat.getCurrencyInstance(locale[i]).format(payment);
            System.out.println(place[i] + ": " + money);
        }
    }
}