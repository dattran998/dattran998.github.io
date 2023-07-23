import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int n = inputNumberOfElements();
        Integer[] arr = new Integer[n];
        arr = inputArray(n);
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        Integer[] newArr = new Integer[set.size()];
        set.toArray(newArr);

        for (int i = 0; i < newArr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (newArr[i] == arr[j]) {
                    count++;
                }
            }
            map.put(newArr[i], count);
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println("Số lần xuất hiện của phần tử " + newArr[i] + " là: " + map.get(newArr[i]) );
        }
    }

    private static Integer[] inputArray(int n) {
        Integer[] arr = new Integer[n];
        System.out.println("Nhập mảng số nguyên dương: ");
        for (int i = 0; i < n; i++) {
            do {
                try {
                    System.out.println("arr[" + i + "] = ");
                    arr[i] = new Scanner(System.in).nextInt();
                    if (arr[i] > 0) {
                        break;
                    } else {
                        System.out.println("Mảng gồm các số nguyên dương, vui lòng nhập lại!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                }
            } while (true);
        }

        return arr;
    }

    private static int inputNumberOfElements() {
        int n;
        do {
            try {
                System.out.println("Nhập số phần tử của mảng: ");
                n = new Scanner(System.in).nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Số phần tử của mảng phải lớn hơn 0, vui lòng nhập lại!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return n;
    }
}
