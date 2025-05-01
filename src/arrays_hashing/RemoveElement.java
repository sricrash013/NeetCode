package arrays_hashing;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int val = scanner.nextInt();
        System.out.println(removeElements(nums, val));
    }

    public static int removeElements(int[] nums, int val) {
        return (int) Arrays.stream(nums).filter(value -> value!=val).count();
    }
    public static int removeElements2(int[] nums, int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
