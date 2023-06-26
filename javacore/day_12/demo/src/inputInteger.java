import java.util.InputMismatchException;
import java.util.Scanner;

public class inputInteger {
    public static void main(String[] args) {
        int n;

        do {
            try {
                System.out.println("Nhập số phần tử mảng: ");
                n = new Scanner(System.in).nextInt();
                if (n > 0)
                    break;
                else {
                    System.out.println("Số phần tử mảng phải lớn hơn 0, mời nhập lại: ");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, mời nhập lại");
            }

        } while (true);

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i +"]" + " =" );
            do {
                try {
                    a[i] = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Số vừa nhập không đúng định dạng, mời nhập lại");
                }
            } while (true);

        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i +"]" + " = " + a[i] );

        }
    }

}
