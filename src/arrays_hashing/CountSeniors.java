package arrays_hashing;

import java.util.Scanner;

public class CountSeniors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        System.out.println(countSeniors(s));
    }

    public static int countSeniors(String[] details) {
        int count = 0;
        for (String s : details) {
            if (Integer.parseInt(s.substring(11, 13)) > 60) {
                count++;
            }
        }
        return count;
    }
}
