import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    private static void thuong2So() {
        int a = 0;

        do {
            try {
                System.out.println("Nhập a: ");
                a = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Nhập số không đúng định dạng hoặc không đúng kiểu dữ liệu, vui lòng nhập lại");
            }
        } while (true);



        int b;
        System.out.println("Nhập b: ");
        b = new Scanner(System.in).nextInt();

        System.out.println("a/b = " + a/b);
    }
}