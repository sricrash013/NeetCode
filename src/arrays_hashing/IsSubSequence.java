package arrays_hashing;

import java.util.Scanner;

/**
 * Created by Sridhar Krishnan on 30/04/25
 **/
public class IsSubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(isSubSequence(s, t));
    }

    public static boolean isSubSequence(String s, String t) {
        int i = 0, j = 0;
        if(s.isEmpty()){
            return true;
        }
        if(s.length()>t.length()){
            return false;
        }
        while (i < s.length() && j < t.length()) {
            if (s.codePointAt(i) == t.codePointAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
