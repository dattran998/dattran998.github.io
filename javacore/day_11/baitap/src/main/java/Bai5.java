import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        String str;
        System.out.println("Nhập chuỗi: ");
        str = new Scanner(System.in).nextLine();

        String[] strings = str.split("\\s+");

        StringBuilder result = new StringBuilder();

        result = result.append(strings[strings.length-1]);

        for (int i = 0; i < strings.length - 1; i++) {
            result = result.append(" " + strings[i]);
        }
        System.out.println(result);
    }

}
