import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        CompairTwoNum();
        Bai1();
        Bai2();
        Bai3();
        Bai4();
        Bai5a();
        Bai5b();
    }

    public static void CompairTwoNum() {
        int number;
        int ramdomNumber;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Nhập vào number: ");
        number = sc.nextInt();
        System.out.println("Number = " + number);

        ramdomNumber = ran.nextInt(100) + 1;
        System.out.println("RandomNumber = " + ramdomNumber);

        String s =  (number > ramdomNumber)? "number > randomNumber" : "number <= randomNumber";
        System.out.println(s);
    }

    public static void Bai1() {
        int a = 0, b = 0;
        double x;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số a khác 0: ");
            a = sc.nextInt();
            if (a == 0)
                System.out.println("a phải khác 0, yêu cầu nhập lại");
        } while (a == 0);


        System.out.println("Nhập b: ");
        b = sc.nextInt();

        x = (double)-b / a;
        System.out.println("Phương trình có nghiệm x = " + x);

    }

    public static void Bai2() {
        int a, b, c;
        double delta;
        double x1, x2;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số a khác 0: ");
            a = sc.nextInt();
            if (a == 0)
                System.out.println("a phải khác 0, yêu cầu nhập lại");
        } while (a == 0);

        System.out.println("Nhập b: ");
        b = sc.nextInt();

        System.out.println("Nhập c: ");
        c = sc.nextInt();

        System.out.println("Phương trình đã cho có dạng: " + a + "x^2 + " + b + "x + " + c + " = 0");

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0)
            System.out.println("Phương trình vô nghiệm");
        else if (delta == 0) {
            x1 = -b / 2 * a;
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Phương trình có nghiệm x1 = " + x1 + "; x2 = " + x2 );
        }
    }

    public static void Bai3() {
        int d, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài hình chữ nhật: ");
        d = sc.nextInt();

        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        r = sc.nextInt();

        System.out.println("Chu vi hình chữ nhật bằng: " + (2 * (d + r)));
        System.out.println("Diện tích hình chữ nhật bằng: " + (d * r));
    }

    public static void Bai4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ngày tháng năm sinh (dd/mm/yyyy): ");
        String dateString = sc.nextLine();

        LocalDate birthday = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);

        System.out.printf("Tuổi của bạn là %d", period.getYears());
    }

    public static void Bai5a() {
        String str;
        char c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi str: ");
        str = sc.nextLine();

        System.out.println("Nhập vào ký tự c: ");
        c = sc.next().charAt(0);

        int firstIndex = str.indexOf(c);

        int lastIndex = str.lastIndexOf(c);

        System.out.println("Vị trí đầu tiên của ký tự " + c +  " trong chuỗi " + str + " là " + firstIndex);
        System.out.println("Vị trí cuối cùng của ký tự " + c + " trong chuỗi " + str +" là " + lastIndex);
    }

    public static void Bai5b() {
        String s, s1, s2, sn = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi s: ");
        s = sc.nextLine();

        System.out.println("Nhập chuỗi s1: ");
        s1 = sc.nextLine();

        System.out.println("Nhập chuỗi s2: ");
        s2 = sc.nextLine();

        int count = 0;
        int index = s.indexOf(s1);

        while (index != -1) {
            count++;
            sn = s.replace(s1, s2);
            index = s.indexOf(s1, index + 1);
        }

        System.out.println("Số lần xuất hiện của " + s1 + " trong " + s + " là: " + count);
        System.out.println("Chuỗi mới là: " + sn);
    }


}
