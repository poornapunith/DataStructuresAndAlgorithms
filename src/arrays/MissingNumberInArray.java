package arrays;
//Missing Number
//Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
//
//        Example
//
//        myArray = {1,2,3,4,6}
//findMissingNumberInArray(myArray, 6) // 5
//Hint:
//
//Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(findMissingNumberInArray(arr));
    }

    static int findMissingNumberInArray(int[] arr) {
        int n=arr.length+1;
        int sum1 = (n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            sum2+=arr[i];
        }
        return sum1-sum2;
    }
}
