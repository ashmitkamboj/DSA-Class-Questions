import java.util.*;

public class palindrome{
    public static String rearrange(String str) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char i : str.toCharArray()) 
            freq.put(i, freq.getOrDefault(i, 0) + 1);

        int oddCount = 0;
        char oddChar = 0;
        for (var entry : freq.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
                oddChar = entry.getKey();
            }
        }
        if (oddCount > 1) return "-1";

        int n = str.length();
        char[] ans = new char[n];
        int s = 0, e = n - 1;

        for (var entry : freq.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count >= 2) {
                ans[s++] = c;
                ans[e--] = c;
                count -= 2;
            }
            freq.put(c, count);
        }

        if (oddCount == 1) ans[n / 2] = oddChar;
        return new String(ans);
    }
    public static void main(String[] args) {
        String str = "aabcbaabc";
        System.out.println(rearrange(str));
    }
}
