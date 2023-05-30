package com.nguyentientho.app;

public class HelloWorldApp {
    public static void main(String[] args) {
        int i = 10;
        int n = ++i % 5;
        System.out.println("i = " + i + ", " + "n = " + n);
        chuyenDoiNhietDo();
        bai2();
    }

    public static void chuyenDoiNhietDo() {
        int a = 10;
        double b = (a - 32) / 1.8 ;
        System.out.println(a + " độ F bằng: " + b + "độ C");
        System.out.printf("%d độ F bằng %.3f độ C", a, b);
    }

    public static void bai2() {
        double d;
        d = (double) 9/ 5;
        System.out.println("d = " + d);
    }

}
