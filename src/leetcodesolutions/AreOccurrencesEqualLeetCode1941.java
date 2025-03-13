package leetcodesolutions;

//Given a string s, return true if s is a good string, or false otherwise.
//A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

//Example 1:
//Input: s = "abacbc"
//Output: true
//Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

//Example 2:
//Input: s = "aaabb"
//Output: false
//Explanation: The characters that appear in s are 'a' and 'b'.
//        'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

import java.util.HashMap;
import java.util.Map;

public class AreOccurrencesEqualLeetCode1941 {
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        char[] chars = s.toCharArray();
        int n=chars.length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        int check = map.get(chars[0]);
        for(int i=1;i<n;i++)
        {
            if(check!=map.get(chars[i]))
                return false;
        }
        return true;
    }
}
