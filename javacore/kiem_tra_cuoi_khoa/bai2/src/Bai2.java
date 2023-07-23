import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n = 0;
        double sum = 0;
        double PI = 0;

        try {
            System.out.println("Nhập n = ");
            n = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Số vừa nhập không hợp lệ, vui lòng nhập lại");
        }

        for (int i = 0; i <= n; i++) {
            sum += Math.pow((-1), i) * (1.0 / (2 * i + 1));
        }

        PI = sum * 4;
        System.out.println(PI);
    }
}
