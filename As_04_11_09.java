import java.util.*;
public class As_04_11_09 {
   // -Find the Frequency of Odd & Even Numbers in the given Matrix
    public static void main(String[] args) {
        int p;
        int q;
        int count1 = 0;
        int count2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in matrix:");
        q = s.nextInt();
        int a[][] = new int[p][q];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Given Matrix:");
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                if((a[i][j] % 2) == 0)
                {
                    count1++;
                }
                else
                {
                    count2++;
                }
            }
        }
        System.out.println("Even number frequency:"+count1);
        System.out.println("Odd number frequency:"+count2);
    }
}
