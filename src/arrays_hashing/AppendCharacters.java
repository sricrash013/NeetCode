package arrays_hashing;

import java.util.Scanner;

/**
 * Created by Sridhar Krishnan on 30/04/25
 **/
public class AppendCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(appendCharacters(s, t));
    }

    public static int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        if (s.isEmpty()) {
            return t.length();
        }
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return t.length() - i;
    }
}
