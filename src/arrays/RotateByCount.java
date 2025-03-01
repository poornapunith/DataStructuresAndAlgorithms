package arrays;

import java.util.Arrays;

public class RotateByCount {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        int count =2;
        int n = arr.length;
        rotate(arr,0,count-1);
        rotate(arr,count,n-1);
        rotate(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
