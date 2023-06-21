import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        String s1;
        String s2;
        System.out.println("Nhập s1: ");
        s1 = new Scanner(System.in).nextLine();

        System.out.println("Nhập s2: ");
        s2 = new Scanner(System.in).nextLine();

        int index = s1.indexOf(s2);

        while (index != -1) {
            s1 = s1.substring(0, index) + s1.substring(index + s2.length());
            index = s1.indexOf(s2);
        }

        System.out.println(s1);
    }
}
