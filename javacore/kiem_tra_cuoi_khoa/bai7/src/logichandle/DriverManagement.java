package logichandle;

import entity.Driver;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DriverManagement {
    private final List<Driver> drivers = new ArrayList<>();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void inputNewDriver() {
        System.out.println("Bạn  muốn thêm mới bao nhiêu lái xe: ");
        int driverNumber = inputNumberOfDriver();
        for (int i =0; i < driverNumber; i++) {
            Driver driver = new Driver();
            System.out.println("Nhập thông tin của lái xe thứ " + (i + 1) + ":");
            driver.inputInfor();
            drivers.add(driver);
        }
    }

    public void showDriver() {
        for (Driver x : drivers) {
            System.out.println(x.toString());
        }
    }
    private int inputNumberOfDriver() {
        int n;
        do {
           try  {
                n = new Scanner(System.in).nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Số lái xe thêm mới phải là số dương, vui lòng nhập lai!");
                }
           } catch (InputMismatchException e ) {
               System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
           }
        } while (true);
        return n;
    }
}
