package arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainingValue = target - nums[i];
            if (map.containsKey(remainingValue)) {
                return new int[]{map.get(remainingValue), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
