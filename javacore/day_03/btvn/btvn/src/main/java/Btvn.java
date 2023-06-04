import java.util.Scanner;

public class Btvn {
    public static void main(String[] args) {
//        Bai1();
//        Bai2();
//        Bai3();
//        Bai4();
        Bai5();
    }

    public static void Bai1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                } else
                    System.out.print("Fizz " );
            } else {
                if (i % 5 == 0)
                    System.out.print("Buzz ");
                else
                    System.out.print(i + " ");
            }
        }
    }

    public static void Bai2() {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        str = sc.nextLine();

        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char)i;
            }
        }

        System.out.println("Ký tự xuất hiện nhiều nhất trong chuỗi " + str + " là " + mostFrequentChar);
    }

    public static void Bai3() {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        System.out.println("Nhập m: ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("*  ");
            System.out.println("");
        }
    }

    public static void Bai4() {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");
        n = sc.nextInt();

        System.out.println("Nhập m: ");
        m = sc.nextInt();

        for(int i = 1; i <= m; i++) {
            for(int k = 1 ; k <= n; k++){
                if(i == 1 || k == 1 || i == m || k == n){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.printf("\n");
        }
    }

    public static void Bai5() {
        int num;
        int newNum = 0;
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên dương: ");
        num = sc.nextInt();

        do {
            a = num % 10;
            newNum = newNum * 10 + a;
            num /= 10;
        } while (num != 0);

        System.out.println("Số đảo ngược là: " + newNum);
    }
}
