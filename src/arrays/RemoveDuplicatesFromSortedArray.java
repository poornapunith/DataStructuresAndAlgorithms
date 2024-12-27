package arrays;

//Remove Duplicates from Sorted Array - LeetCode 26
//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
//
//Example:
//
//Input: nums = [1, 1, 2]
//Output: 2
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
            }

        }
        return i+1;
    }
}
