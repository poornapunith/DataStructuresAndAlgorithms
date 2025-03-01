package leetcodesolutions;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//
//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//
//Example 3:
//Input: nums = [1,3,5,6], target = 7
//Output: 4

public class SearchInsertPositionLeetCode35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 5));
        System.out.println(searchInsert(nums, 2));
        System.out.println(searchInsert(nums, 7));

    }

    public static int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length;
        int mid=(start+end)/2;
        while(start<end)
        {
            mid=(start+end)/2;
            if(target==nums[mid])
                return mid;
            else if(target<nums[mid])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }
}
