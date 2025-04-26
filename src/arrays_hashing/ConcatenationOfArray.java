package arrays_hashing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sridhar Krishnan on 21/04/25
 **/
public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] num = new int[length];
        for (int i = 0; i < length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(num)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] concatenated = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            concatenated[i] = concatenated[nums.length + i] = nums[i];
        }
        return concatenated;
    }

    public static int[] getConcatenationLibrary(int[] nums) {
        int[] concatenated = new int[nums.length];
        System.arraycopy(nums, 0, concatenated, 0, nums.length);
        System.arraycopy(nums, 0, concatenated, nums.length, nums.length);

        return concatenated;

    }
}
