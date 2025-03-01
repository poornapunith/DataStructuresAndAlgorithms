package leetcodesolutions;

public class RemoveDuplicatesFromSortedArrayLeetCode26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3, 3, 4};
        int count = removeDuplicates(nums);
        for(int i = 0; i < count; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int n=nums.length;

        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[count])
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
