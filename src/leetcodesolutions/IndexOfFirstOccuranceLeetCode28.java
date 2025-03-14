package leetcodesolutions;
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Example 1:
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//
//Example 2:
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.

public class IndexOfFirstOccuranceLeetCode28 {
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
        if (haystack == null || needle == null) return -1;
        else if (haystack.length() < needle.length()) return -1;
        else
        {
            for(int i=0;i<=haystack.length()-needle.length();i++)
            {
                if(haystack.substring(i,i+needle.length()).equals(needle))
                    return i;
            }
            return -1;
        }

    }
}
