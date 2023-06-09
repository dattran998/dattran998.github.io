import java.util.Random;
import java.util.Scanner;

public class Btvnthem {
    public static void main(String[] args) {
//        bai3();
//        bai8();
//        bai9();
//        bai11();
//        bai15();
//        bai16();
//        bai17();
        bai18();
    }

    public static void bai3() {
        int n;
        int tmp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhập mảng");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        System.out.println("Mảng sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void bai8() {
        int n;
        int count = 1;
        int maxCount = 1;
        int maxIndex = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhập mảng");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                maxIndex = i;
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là " + a[maxIndex]);

    }

    public static void bai9() {
        int n = 10; // số phần tử của mảng
        int[] a = new int[n]; // khởi tạo mảng a

        // tạo mảng ngẫu nhiên
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10); // tạo số ngẫu nhiên từ 0 đến 9
        }

        // in ra các số khác nhau trong mảng
        System.out.print("Các số khác nhau trong mảng là: ");
        for (int i = 0; i < n; i++) {
            boolean isDifferent = true;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void bai11() {
        int m;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập m: ");
        m = sc.nextInt();
        System.out.println("Nhập n: ");
        n = sc.nextInt();

        int[][] a = new int[m][n];

        System.out.println("Nhập mảng a: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng a: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[][] b = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = a[j][i];
            }
            System.out.println();
        }

        System.out.println("Ma trận chuyển bị B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bai15() {
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += (1.0 / i);
        }

        System.out.println("S = " + sum);
    }

    public static void bai16() {
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 7 == 0)
                sum += i;
        }

        System.out.println("S = " + sum);
    }

    public static void bai17() {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        System.out.println("Số chẵn: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print(i + "; ");
        }

        System.out.println("Số lẻ: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0)
                System.out.print(i + "; ");
        }
    }

    public static void bai18() {
        int n, m;
        boolean check = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        System.out.println("Nhập m: ");
        m = sc.nextInt();

        for (int i = 2; i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                check = false;
                break;
            } else
                check = true;
        }

        if (check == true)
            System.out.println("Hai số nguyên tố cùng nhau");
    }
}
