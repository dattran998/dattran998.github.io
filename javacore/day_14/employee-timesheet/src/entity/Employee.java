package entity;

import java.util.Scanner;

public class Employee extends Person{
    private static int AUTO_ID = 1000;

    private int id;
    private int level;

    public Employee() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập bậc thợ từ 1 đến 7: ");
        do {
            try {
                this.setLevel(new Scanner(System.in).nextInt());
                if (this.getLevel() >= 1 && this.getLevel() <= 7) {
                    break;
                }
                else
                    System.out.println("Bậc thợ từ 1 đến 7, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);


    }
}
