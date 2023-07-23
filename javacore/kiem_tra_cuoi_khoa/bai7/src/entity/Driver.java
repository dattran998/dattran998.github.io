package entity;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Driver extends Person {
    public static int AUTO_ID = 10000;
    private int idDriver;
    private Level level;


    public Driver(String name, String address, String phone, int idDriver, Level level) {
        super(name, address, phone);
        this.level = level;
    }

    public Driver() {
        this.idDriver = AUTO_ID;
        AUTO_ID++;
    }


    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "idDriver=" + idDriver +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfor() {
        super.inputInfor();
        System.out.println("Nhập trình độ của lái xe (A - F): ");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");
        System.out.println("Chọn: ");

        char levelChoice;
        do {
            try {
                levelChoice = new Scanner(System.in).next().charAt(0);
                if (levelChoice >= 'A' && levelChoice <= 'F') {
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
            }

        } while (true);

        switch (levelChoice) {
            case 'A':
                this.setLevel(Level.A);
                break;

            case 'B':
                this.setLevel(Level.B);
                break;

            case 'C':
                this.setLevel(Level.C);
                break;

            case 'D':
                this.setLevel(Level.D);
                break;

            case 'E':
                this.setLevel(Level.E);
                break;

            case 'F':
                this.setLevel(Level.F);
                break;
        }
    }
}
