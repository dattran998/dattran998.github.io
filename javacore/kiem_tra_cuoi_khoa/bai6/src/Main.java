import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = inputNumberOfElements();
        Integer[] arr = randomArray(n);
        System.out.println("Mảng vừa tạo: ");
        showArray(arr);

        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        showArray(arr);

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        set.toArray(arr);
        System.out.println("Mảng sau khi bỏ bớt các phần tử trùng lặp: ");
        showArray(arr);
    }

    private static void showArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    private static Integer[] randomArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt();
        }
        return arr;
    }

    private static int inputNumberOfElements() {
        int n;
        do {
            try {
                System.out.println("Nhập số phần tử của mảng: ");
                n = new Scanner(System.in).nextInt();
                if (n > 0) break;
                else System.out.println("Số phần tử của mảng phải lớn hơn 0, vui lòng nhập lại!");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại!");
            }
        } while (true);
        return n;
    }
}
