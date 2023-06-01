import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CompairTwoNumber {
    public static void main(String[] args) {
        String str = "aaabbbbccc";
        String newstr1 = str.substring(0, 1 ) + str.substring((1 + 1));
        System.out.println(newstr1);
        String newstr = "";

        for(int i = 0; i < (str.length() - 1); i++){
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    newstr = str.substring(0, j ) + str.substring((j + 1));

                }
            }
        }

        System.out.println(newstr);
    }
}
