import java.util.Scanner;

public class Btvn {
    public static void main(String[] args) {
//        bai1a();
//        bai1b();
//        bai1c();
//        bai2a();
//        bai2b();
//        bai2c();
//        bai3();
//        bai4();
//        bai5();
//        bai6();
//        bai7();
//        bai8();
//        bai9();
//        bai10();
//        bai11();
        bai12();
    }

    public static void bai1a() {
        for (int i = 1000000; i <= 999999999; i ++) {
            int aReverse = 0;
            int tmp = i;
            int b;

            do {
                b = tmp % 10;
                aReverse = aReverse * 10 + b;
                tmp /= 10;
            } while (tmp != 0);

            if(i == aReverse)
                System.out.print(aReverse + " ");
        }
    }

    public static void bai1b() {
        for (int i = 1000000; i <= 999999999; i ++) {
            int digits;
            int tmp = i;
            boolean check;

            do{
                digits = tmp % 10;
                tmp /= 10;
                if (digits != 0 && digits != 6 && digits != 8) {
                    check = false;
                    break;
                }
                else
                    check = true;
            } while (tmp != 0);

            if (check == true)
                System.out.println(i);
        }

    }

    public static void bai1c() {
        for (int i = 1000000; i <= 999999999; i ++) {
            int digits;
            int tmp = i;
            int sum = 0;

            do{
                digits = tmp % 10;
                sum += digits;
                tmp /= 10;

            } while (tmp != 0);

            if (sum % 10 == 0)
                System.out.println(i);
        }
    }

    public static void bai2a() {
        boolean check = false;
        for (int i = 1000000; i < 10000000; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                } else
                    check = true;
            }

            if (check == true)
                System.out.println(i);
        }
    }

    public static void bai2b() {
        boolean check = false;
        int digits;
        int tmp;
        for (int i = 1000000; i < 10000000; i++) {
            tmp = i;
            do {
                digits = tmp % 10;
                tmp /= 10;

                if (digits == 0 || digits == 1 || digits == 2){
                    check = false;
                    break;
                } else {
                    for (int j = 2; j < digits; j++) {
                        if (digits % j == 0) {
                            check = false;
                            break;
                        } else
                            check = true;
                    }
                }

            } while (tmp != 0 && check == true);

            if (check == true)
                System.out.println(i);
        }
    }

    public static void bai2c() {
        boolean check = false;
        boolean reverseCheck = false;
        int tmp;
        int b;

        for (int i = 1000000; i < 10000000; i++) {
            tmp = i;
            int aReverse = 0;

            do {
                b = tmp % 10;
                aReverse = aReverse * 10 + b;
                tmp /= 10;
            } while (tmp != 0);

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                } else
                    check = true;
            }

            if (check == true) {
                for (int k = 2; k <= aReverse / 2; k++) {
                    if (aReverse % k == 0) {
                        reverseCheck = false;
                        break;
                    } else
                        reverseCheck = true;
                }
            }

            if (check == true && reverseCheck == true)
                System.out.println(i);
        }
    }

    public static void bai3() {
        int n;
        int count = 0;
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

        for (int i = 0; i < n-1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }
        }

        System.out.println("Số cặp 2 phần tử liên tiếp bằng nhau là " + count);
    }

    public static void bai4() {
        int n;
        int count = 0;
        int max = 0;
        int maxIndex = 0;
        int secondIndex = 0;
        int secondMax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhập mảng");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        max = a[0];
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < n ;i++) {
                if (a[i] != max && secondMax < a[i]) {
                    secondMax = a[i];
                    secondIndex = i;
                }
            }

        System.out.println("Số thứ lớn thứ 2 trong mảng là " + secondMax + " ở vị trí " + secondIndex);
    }

    public static void bai5() {
        int n;
        int count = 0;
        int sum = 0;
        double average;
        int b, c;
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

        System.out.println("Nhập b: ");
        b = sc.nextInt();
        System.out.println("Nhập c: ");
        c = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] >= b && a[i] <= c) {
                sum += a[i];
                count++;
            }
        }

        average = sum / count;
        System.out.printf("Trung bình cộng của mảng nằm trong đoạn [%d, %d] là %.2f\n", b, c, average);
    }

    public static void bai6() {
        int n;
        boolean check = false;

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

        for (int i = 0; i < n; i++) {
            if(a[i] != a[n -1 - i]) {
                check = false;
                break;
            } else
                check = true;
        }

        if (check == true)
            System.out.println("Mảng đối xứng");
        else
            System.out.println("Mảng không đối xứng");
    }

    public static void bai7() {
        int n;
        boolean check = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        n = sc.nextInt();

        int[] a = new int[n];
        a[0] = 1;

        System.out.println("Nhập mảng");
        for (int i = 1; i < n; i++) {
            do {
                System.out.printf("a[%d] = ", i);
                a[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        check = false;
                        System.out.printf("Yêu cầu nhập lại a[%d]: \n", i);
                        break;
                    } else
                        check = true;
                }
            } while (check == false);
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
    }

    public static void bai8() {
        int m;
        int n;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập m: ");
        m = sc.nextInt();
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.println("Nhập k: ");
        k = sc.nextInt();

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

        int[][] b = new int[n][k];

        System.out.println("Nhập mảng b: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("b[%d][%d] = ", i, j);
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng b: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int[][] c = new int[m][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int p = 0; p < n; p++) {
                    c[i][j] += a[i][p] * b[p][j];
                }
            }
        }

        System.out.println("Mảng c: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bai9() {
        for (int i = 100000; i < 1000000; i ++) {
            int aReverse = 0;
            int tmp = i;
            int digits;
            int sum = 0;

            do {
                digits = tmp % 10;
                sum += digits;
                aReverse = aReverse * 10 + digits;
                tmp /= 10;
            } while (tmp != 0);

            if (i == aReverse && sum % 10 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void bai10() {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập m: ");
        m = sc.nextInt();
        System.out.println("Nhập n: ");
        n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            int num = (int)Math.sqrt(i);
            if (num * num == i)
                System.out.println(i);
        }
    }

    public static void bai11() {
        int m;
        int n;
        int max;
        int min;
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

        max = a[0][0];
        min = a[0][1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j])
                    max = a[i][j];

                if (min > a[i][j])
                    min = a[i][j];
            }
        }

        System.out.println("max = " + max + ", min = " + min);
    }

    public static void bai12() {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Nhập mảng a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            sum += a[i][i];
        }

        System.out.println("Tổng đường chéo chính = " + sum);
    }
}
