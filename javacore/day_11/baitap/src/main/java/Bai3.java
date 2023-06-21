import javafx.beans.binding.StringBinding;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        String s;
        System.out.println("Nhập chuỗi: ");
        s = new Scanner(System.in).nextLine();

        s = s.trim().replaceAll("\\s+", " ");

        s = s.toLowerCase();

        StringBuilder result = new StringBuilder();
        boolean capitalizeNextChar = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                capitalizeNextChar = true;
                result = result.append(c);
            } else if (capitalizeNextChar) {
                result.append(Character.toUpperCase(c));
                capitalizeNextChar = false;
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
    }
}
