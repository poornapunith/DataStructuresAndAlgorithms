package leetcodesolutions;

//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//
//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

import java.util.Arrays;

public class LongestCommonPrefixLeetCode14 {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        char[] s1 = strs[0].toCharArray();
        char[] s2 = strs[strs.length-1].toCharArray();

        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]!=s2[i])
                break;
            result.append(s1[i]);
        }
        return result.toString();
    }
//BruteForce
//    public static String longestCommonPrefix(String[] strs) {
//        int i = Integer.MAX_VALUE;
//        String s="";
//        String result="";
//        for(int j=0;j<strs.length;j++){
//            if(strs[j].length()<i){
//                i = strs[j].length();
//                s = strs[j];
//            }
//        }
//        int flag=0;
//        for(int j=1;j<=s.length();j++){
//            String temp = s.substring(0,j);
//            System.out.println("Temp : "+ temp);
//            for(String str:strs){
//                System.out.println("Checking : "+str);
//                if(!str.startsWith(temp)){
//                    System.out.println("Starting with temp");
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==1)
//                break;
//
//            result = temp;
//        }
//        return result;
//    }
}
