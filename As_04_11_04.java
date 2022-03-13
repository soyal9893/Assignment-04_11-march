import java.util.*;
public class As_04_11_04 {
    //   "Java Program to find the longest repeating sequence in a string
    static void printPermutaion(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
        }
        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);


            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            if (alpha[ch - 'a'] == false)
               printPermutaion(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }
    public static void main(String[] args) {

        String s = "geek";
        printPermutaion(s, "");
    }
}
