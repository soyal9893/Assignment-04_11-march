import java.util.*;
public class As_04_11_06 {
    public static void main(String[] args) {
        // add two 2D matrices to get the result matrix
        int[][] arr = {{1, 2},
                      {4, 5}};
        int[][] arr1 = {{3, 6},
                        {7, 8}};
        int[][] sum = {{0, 0},
                       {0, 0}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(sum[i][j]+" ");

            }
            System.out.println("");
        }
    }
}