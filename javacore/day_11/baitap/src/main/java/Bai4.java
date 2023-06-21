import java.io.StringReader;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        String str;
        System.out.println("Nhập vào chuỗi: ");
        str = new Scanner(System.in).nextLine();

        String[] words = str.split("\\s+");
        int maxLength = 0;
        int maxIndex = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxIndex = i;
            }
        }

        System.out.println("Từ dài nhất là: " + words[maxIndex] + " tại vị trí " + (maxIndex + 1));
    }
}
