import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        removeDuplicate();
//        sum();
        change();
    }

    public static void removeDuplicate() {
        String str;
        String newStr = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi str: ");
        str = sc.nextLine();

        System.out.println("Chuỗi ban đầu là: " + str);

        char arr[] = str.toCharArray();

        for(char c : arr) {
            if (newStr.indexOf(c) == -1)
                newStr += c;
        }

        System.out.println(newStr);
    }

    public static void sum() {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số trong khoảng từ 0 đến 1000: ");
        num = sc.nextInt();

        System.out.println("Số vừa nhập là " + num);

        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);

        System.out.println("Tổng các chữ số là " + sum);
    }

    public static void change() {
        int gio = 0, ngay = 0, nam = 0;
        Scanner sc = new Scanner(System.in);

        int choose;
        do {
            System.out.println("Chọn giá trị đầu vào để chuyển đổi");
            System.out.println("1. Đầu vào là số giờ");
            System.out.println("2. Đầu vào là số phút");
            System.out.println("3. Đầu vào là số giây");

            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    int hour;
                    System.out.println("Nhập số giờ: ");
                    hour = sc.nextInt();

                    int newhour = hour;


                    if (newhour >= 24) {
                        ngay = newhour / 24;
                        newhour = newhour % 24;
                        if (ngay >= 356) {
                            nam = ngay / 365;
                            ngay %= 356;
                        }
                    }

                    System.out.println(hour + " giờ bằng " + nam + " năm, " + ngay + " ngay, " + newhour + " giờ");
                    break;

                case 2:
                    int minute;
                    System.out.println("Nhập số phút: ");
                    minute = sc.nextInt();

                    hour = minute / 60;

                    if (hour >= 24) {
                        ngay = hour / 24;
                        hour = hour % 24;
                        if (ngay >= 356) {
                            nam = ngay / 365;
                            ngay %= 356;
                        }
                    }

                    System.out.println(minute + " giờ bằng " + nam + " năm, " + ngay + " ngay, " + hour + " giờ");
                    break;

                case 3:
                    int second;
                    System.out.println("Nhập số giây: ");
                    second = sc.nextInt();

                    hour = second / 3600;

                    if (hour >= 24) {
                        ngay = hour / 24;
                        hour = hour % 24;
                        if (ngay >= 356) {
                            nam = ngay / 365;
                            ngay %= 356;
                        }
                    }

                    System.out.println(second + " giây bằng " + nam + " năm, " + ngay + " ngay, " + hour + " giờ");
                    break;

                default:
                    System.out.println("Giá trị đầu vào không hợp lệ");
                    System.out.println("Yêu cầu nhập lại");
            }
        } while (choose != 1 && choose != 2 && choose != 3);

    }
}
