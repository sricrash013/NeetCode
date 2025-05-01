package arrays_hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(generate(n));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 2).get(j - 2) + result.get(i - 2).get(j-1));
                }
            }
            result.add(row);
        }
        return result;
    }
}
