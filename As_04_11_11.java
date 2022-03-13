import java.util.*;
public class As_04_11_11 {
    public static void main(String[] args) {
        //Java Program to Use Try and Catch for Exception Handling
        int a=10;
        int b=0;
        try {
            int div = a / b;
            System.out.println(div);
        }catch(ArithmeticException ex) {
            System.out.println("no worry");
        }
    }
}
