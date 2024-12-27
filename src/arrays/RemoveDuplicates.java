package arrays;

import java.util.Arrays;

//Duplicate Number
//Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
//
//Example
//
//removeDuplicates({1, 1, 2, 2, 3, 4, 5})
//Output : [1, 2, 3, 4, 5]
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] newArr = new int[arr.length];
        int newIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            boolean unique = true;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    unique = false;
                    break;
                }
            }

            if(unique)
            {
                newArr[newIndex++]=arr[i];
            }
        }
        return Arrays.copyOf(newArr,newIndex);
    }
}
