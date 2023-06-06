import java.util.Scanner;

public class Btvn {
    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
        bai5();
    }

    public static void bai1() {
        int n;
        int max;
        int min;
        float average;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử mảng: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        max = arr[0];
        min = arr[0];

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }

        average = (float) sum  / n;

        System.out.println("Giá trị trung bình cộng củ mảng trừ đi GTLN và GTNN là: " + average);
    }

    public static void bai2() {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    System.out.println(array1[i]);
            }
        }
    }

    public static void bai3() {
        int [] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int [] my_new_array = new int[my_array.length + 1];


        for (int i = 0; i < my_new_array.length; i++) {
            if (i < 2)
                my_new_array[i] = my_array[i];
            else if (i == 2)
                my_new_array[i] = 5;
            else
                my_new_array[i] = my_array[i - 1];
        }

        for (int i = 0; i < my_new_array.length; i++)
            System.out.print(my_new_array[i] + "  ");
    }

    public static void bai4() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        float average;

        for (int i = 0; i <numbers.length; i++)
            sum += numbers[i];

        average = sum / numbers.length;

        System.out.println("Giá trị trung bình cảu các phần tử mảng là: " + average);
    }

    public static void bai5() {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.println("Nhập m: ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
