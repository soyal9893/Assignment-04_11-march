import java.util.*;
public class As_04_11_07 {
    public static void main(String[] args) {
        //lower triangular matrix
        int arr[][]={{1,2,3,0},{0,0,7,8},{0,0,0,4},{0,0,0,0}};
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
