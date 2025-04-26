package arrays_hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Sridhar Krishnan on 21/04/25
 **/
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}
