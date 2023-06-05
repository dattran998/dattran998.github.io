import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        bai1();
    }

    public static void bai1() {
        int n;
        System.out.println("Số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

//        Tăng các phần tử là số chẵn lên 1 đơn vị
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arr[i]++;
        }

        System.out.println("Mảng sau khi tăng phần tử chẵn lên 1 đơn vị: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
