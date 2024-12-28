package arrays;

import java.util.HashMap;
import java.util.Map;
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation:The element 1 occurs at the indices 0 and 3.
public class ContainsDuplicateLeetCode217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            else
            {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
