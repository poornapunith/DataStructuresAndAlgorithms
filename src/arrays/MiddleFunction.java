package arrays;

//Middle Function
//Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
//
//myArray = [1, 2, 3, 4]
//middle(myArray)  # [2,3].

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(middle(array)));
    }

    public static int[] middle(int[] array) {
        int[] arr = new int[(array.length) - 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i + 1];
        }
        return arr;
    }
}
