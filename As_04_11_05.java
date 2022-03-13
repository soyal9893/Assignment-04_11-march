import java.util.*;
public class As_04_11_05 {
    public static void main(String[] args) {
        //Java Program to swap two string variables without using third or temp variable.
        String str= "geekstar";
        String str1="geeks";
        System.out.println("Before :"+str+" "+str1);
        str = str + str1;
        str1 = str.substring(0, str.length() - str1.length());
        str = str.substring(str1.length());
        System.out.println("After : " + str + " " + str1);
    }
}
