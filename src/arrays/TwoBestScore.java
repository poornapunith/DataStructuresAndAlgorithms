package arrays;

import java.util.Arrays;
//Best Score
//Given an array, write a function to get first, second best scores from the array and return it in new array.
//
//Array may contain duplicates.
//
//Example
//
//        myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
//firstSecond(myArray) // {90, 87}
public class TwoBestScore {
    public static void main(String[] args) {
        int[] array = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(array)));
    }

    public static int[] findTopTwoScores(int[] array){
        int first = array[0];
        int second = array[1];
        int[] returnArray = new int[2];

        for (int i=0;i<array.length;i++)
        {
            if(array[i]>second && first!=second)
            {
                second=array[i];
            }
            if(array[i]>first)
            {
                first=array[i];
            }
        }
        returnArray[0]=first;
        returnArray[1]=second;

        return returnArray;
    }
}
