import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        String s1;
        String s2;
        int k;
        String result;
        System.out.println("Nhập s1: ");
        s1 = new Scanner(System.in).nextLine();

        System.out.println("Nhập s2: ");
        s2 = new Scanner(System.in).nextLine();

        System.out.println("Nhập vị trí muốn chèn: ");
        k = new Scanner(System.in).nextInt();

        result = s2.substring(0,k) + s1 + s2.substring(k);
        System.out.println(result);
    }
}
