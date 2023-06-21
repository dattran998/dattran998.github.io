import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        String s1;
        String s2;
        System.out.println("Nhập s1: ");
        s1 = new Scanner(System.in).nextLine();

        System.out.println("Nhập s2: ");
        s2 = new Scanner(System.in).nextLine();

        int index = s1.indexOf(s2);
        System.out.println(index);
    }
}
