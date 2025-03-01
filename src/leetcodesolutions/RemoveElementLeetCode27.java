package leetcodesolutions;

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.

//Example 1:
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).

public class RemoveElementLeetCode27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val=2;
        int remaining = removeElement(nums,val);
        for(int i=0;i<remaining;i++)
            System.out.print(nums[i]+" ");

    }

    public static int removeElement(int[] nums, int val) {
        int count =-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                int temp=nums[count+1];
                nums[count+1]=nums[i];
                nums[i]=temp;
                count++;
            }
        }
        return count+1;
    }
}
