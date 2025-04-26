package arrays_hashing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sridhar Krishnan on 24/04/25
 **/
public class ReplaceElementsGreatestRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(replaceElements(t)));
    }

    public static int[] replaceElements(int[] arr) {
        int maxRight = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, current);
        }
        return arr;
    }
}
