import java.util.*;
public class As_04_11_12 {
    public static void main(String[] args) {
        // Java Program to Implement the Nested Try Statements
        int a = 10;
        int b = 0;
        String str=null;

        try {
            int div = a / b;
            System.out.println(div);
            try {
                System.out.println(str.length());
            }
            catch(NullPointerException ex){
                    System.out.println("no way");
                }
            } catch (ArithmeticException ex) {
                System.out.println("no worry");
            }
        }
    }
