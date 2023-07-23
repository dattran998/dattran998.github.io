import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int number = 0;
        int temp = 0;
        List<Integer> list = new ArrayList<>();

        do {
            try {

                System.out.println("Nhập số: ");
                number = new Scanner(System.in).nextInt();
                if (number >= 2) {
                    break;
                } else {
                    System.out.println("Số vừa nhập không thể phân tích thành thừa số nguyên tố, vui lòng nhập lại");
                }
            } catch (InputMismatchException e) {
                System.out.println("Số vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        temp = number;
        for (int i = 2; i <= number; i++) {
            if (primeNumber(i)) {
                while (temp > 0) {
                    if (temp % i == 0) {
                        temp /= i;
                        list.add(i);
                    } else break;
                }
            }
        }

        System.out.print(number + " = ");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + " x ");
            }
        }
    }

    public static boolean primeNumber(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
