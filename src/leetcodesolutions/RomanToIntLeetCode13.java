package leetcodesolutions;
//Example 1:
//Input: s = "III"
//Output: 3
//Explanation: III = 3.

//Example 2:
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.

//Example 3:
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RomanToIntLeetCode13 {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i);
            if(map.get(c1) >= map.get(c2)) {
                result += map.get(c1);
            }
            else {
                result-=map.get(c1);
            }
        }
        result += map.get(s.charAt(s.length()-1));
        return result;
    }
}
