import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        int count = 0;

        int n = inputNumberOfArray();
        Integer[] arr = inputArray(n);
        showArray(arr);
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        Integer[] newArray = new Integer[set.size()];
        set.toArray(newArray);

        for (int i = 0; i < newArray.length; i++) {
            Number number = new Number();
            number.setNum(newArray[i]);
            count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (newArray[i] == arr[j]) {
                    count++;
                }
            }
            number.setCount(count);
            list.add(number);
        }

        showNumberOfOccurrences(list);
        int index = findIndexOfNumberOccursMost(list);
        System.out.println("Số xuất hiện nhiều nhất là: " + list.get(index).getNum());

    }

    private static int findIndexOfNumberOccursMost(List<Number> list) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCount() > max) {
                max = list.get(i).getCount();
                index = i;
            }
        }
        return index;
    }

    private static void showNumberOfOccurrences(List<Number> list) {
        for (Number num : list) {
            System.out.println("Số lần xuất hiện của số " + num.getNum() + " là: " + num.getCount());
        }
    }

    private static void showArray(Integer[] arr) {
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }

    private static Integer[] inputArray(int n) {
        Integer[] arr = new Integer[n];
        System.out.println("Nhập vào mảng số nguyên" + n + " phần tử: ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    private static int inputNumberOfArray() {
        int n;
        do {
            try {
                System.out.println("Nhập n = ");
                n = new Scanner(System.in).nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Số phần tử của mảng phải lớn hơn 0, vui lòng nhập lại");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
            }

        } while (true);
        return n;
    }
}
