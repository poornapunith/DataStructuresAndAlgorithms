package arrays;

//Rotate Matrix
//Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
//DO NOT allocate another 2D matrix and do the rotation.
//{{1,2,3}                 {{7,4,1},
// {4,5,6},     ---->       {8,5,2},
// {7,8,9}}                 {9,6,3}}

public class RotateMatrixLeetCode48 {
    public static void main(String[] args) {

        rotateMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
//        rotateMatrix(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }

    public static void rotateMatrix(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++) {
            for (int j = i; j <n-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }

        System.out.println("Final-------");
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }
    }
}
