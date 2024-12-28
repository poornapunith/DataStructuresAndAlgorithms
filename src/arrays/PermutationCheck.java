package arrays;
//Permutation
//Your are given two integer arrays. Write a program to check if they are permutation of each other.
//Example
//int[] array1 = {1,2,3,4,5};
//int[] array2 = {5,1,2,3,4};
//permutation(array1, array2)
//Output: true
public class PermutationCheck {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        System.out.println(permutation(array1, array2));

    }
    public static boolean permutation(int[] array1, int[] array2){
        if(array1.length==array2.length)
        {
            int sum1=0;
            int sum2=0;
            int product1=1;
            int product2=1;
            for(int i=0;i<array1.length;i++)
            {
                sum1+=array1[i];
                sum2+=array2[i];
                product1*=array1[i];
                product2*=array2[i];
            }
            return (sum1 == sum2 && product1 == product2);
        }
        return false;
    }
}
