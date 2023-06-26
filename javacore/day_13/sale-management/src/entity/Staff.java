package entity;

import java.util.Scanner;

public class Staff extends Person implements InputInfo {
    private static int AUTO_ID = 1000;

    private int staffId;
    private String date;

    public Staff() {
        this.staffId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        super.inputInfo();

        System.out.println("Nhập ngày ký hợp đồng: ");
        this.setDate(new Scanner(System.in).nextLine());
    }
}
