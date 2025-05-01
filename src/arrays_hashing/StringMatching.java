package arrays_hashing;

import java.util.*;

public class StringMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        System.out.println(stringMatching(s));
    }
    public static List<String> stringMatching(String[] words) {
        List<String> matches = new ArrayList<>();
        Arrays.sort(words,(a,b)->a.length()-b.length());
        for(int i=0; i<words.length;i++){
            for(int j=i+1;j< words.length;j++){
                if (words[j].contains(words[i]) && !matches.contains(words[i])){
                    matches.add(words[i]);
                    break;
                }
            }
        }
        return matches;
    }
}
