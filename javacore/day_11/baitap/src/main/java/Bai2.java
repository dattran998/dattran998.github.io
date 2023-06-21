import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String s;
        System.out.println("Nhập xâu ký tự s: ");
        s = new Scanner(System.in).nextLine();

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                if (Character.isUpperCase(c)) {
                    result += c;
                } else
                    result += Character.toUpperCase(c);
            } else {
                if (Character.isUpperCase(c)) {
                    result += Character.toLowerCase(c);
                } else
                     result += c;
            }
        }

        System.out.println(result);
    }

}
