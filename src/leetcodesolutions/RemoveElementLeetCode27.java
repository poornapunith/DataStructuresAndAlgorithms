package leetcodesolutions;

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
