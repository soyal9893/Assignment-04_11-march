import java.util.*;
public class As_04_11_08 {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 0}, {0, 0, 0, 4}, {0, 0, 7, 8}, {0, 2, 3, 4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}