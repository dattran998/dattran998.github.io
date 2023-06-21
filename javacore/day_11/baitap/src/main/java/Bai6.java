import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        String sentence;
        String[] words;

        do {
            System.out.println("Nhập câu: ");
            sentence = new Scanner(System.in).nextLine();

            words = sentence.split("\\s+");

            if (words.length <= 20 && check(words)) {
                break;
            } else {
                System.out.println("Câu nhập không được quá 20 từ và mỗi từ không được quá 10 ký tự, vui lòng nhập lại: ");
            }
        } while (true);

        Arrays.sort(words);

        System.out.println("Các từ theo thứ tự Alphabet: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static boolean check(String[] words) {
        for (int i = 0; i < words.length; i++)
             if (words[i].length() > 10) {
                return false;
            }
        return true;
    }

}
