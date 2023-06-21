import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String s1;
        String s2;
        System.out.println("Nhập s1: ");
        s1 = new Scanner(System.in).nextLine();

        System.out.println("Nhập s2: ");
        s2 = new Scanner(System.in).nextLine();

        int index = s2.indexOf(s1);

        while (index != -1) {
            s2 = s2.substring(0, index) + s2.substring(index + s1.length());
            index = s2.indexOf(s1);
        }

        System.out.println(s2);
    }
}
