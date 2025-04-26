package arrays_hashing;

import java.util.Scanner;

/**
 * Created by Sridhar Krishnan on 21/04/25
 **/
public class ScoreOfAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs(s.codePointAt(i) - s.codePointAt(i + 1));
        }
        return sum;
    }
}
