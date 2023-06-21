import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 100000; i < 1000000; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
}
