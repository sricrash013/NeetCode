package arrays_hashing;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Sridhar Krishnan on 21/04/25
 **/
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] num = new int[length];
        for (int i = 0; i < length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println(hasDuplicate(num));
    }

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            if (map.contains(num)) {
                return true;
            } else {
                map.add(num);
            }
        }
        return false;
    }
}
