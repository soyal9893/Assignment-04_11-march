import java.util.*;
public class As_04_11_10 {
    public static void main(String[] args) {
       // "Java Program to Use Finally Block for Catching Exceptions"
        int a=10;
        int b=0;
        try {
            int div = a / b;
            System.out.println(div);
        }catch(ArithmeticException ex) {
            System.out.println("no worry");
        }
        finally {
            System.out.println("you can do it");
        }
    }
}
