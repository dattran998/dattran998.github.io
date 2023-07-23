import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n = 0;
        double maxDistance = 0;
        do {
            try {
                System.out.println("Nhập số lượng điểm: ");
                n = new Scanner(System.in).nextInt();
                if (n >= 3) {
                    break;
                } else {
                    System.out.println("Số lượng điểm phải lớn hơn hoặc bằng 3, vui lòng nhập lại: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Số vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        List<MyPoint> list = inputPoint(n);


        maxDistance = findMaxDistance(list);
        System.out.println(maxDistance);
    }

    private static double findMaxDistance(List<MyPoint> list) {
        double max = 0;
        for (int i = 0; i < list.size() -1 ; i ++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).distance(list.get(j)) > max) {
                    max = list.get(i).distance(list.get(j));
                }
            }
        }
        return max;
    }

    public static List<MyPoint> inputPoint (int n) {
        List<MyPoint> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MyPoint myPoint = new MyPoint();
            System.out.println("Nhập điểm thứ " + (i + 1) +":");
            do {
                try {
                    System.out.println("x = ");
                    myPoint.setX(new Scanner(System.in).nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                }
            } while (true);

            do {
                try {
                    System.out.println("y = ");
                    myPoint.setY(new Scanner(System.in).nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                }
            } while (true);
            list.add(myPoint);
        }
        return list;
    }
}
