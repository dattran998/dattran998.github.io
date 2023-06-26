package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {
    private static int AUTO_ID = 100;

    private int serviceId;
    private String serviceName;
    private double charges;
    private String unit;

    public Service() {
        this.serviceId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", charges=" + charges +
                ", unit='" + unit + '\'' +
                '}';
    }

    public void inputInfo() {
        System.out.println("Nhập tên DV: ");
        this.setServiceName(new Scanner(System.in).nextLine());
        System.out.println("Nhập giá cước: ");
        do {
            try {
                this.setCharges(new Scanner(System.in).nextDouble());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhâp lại");
            }
        } while (true);
        System.out.println("Nhập đơn vị tính: ");
        this.setUnit(new Scanner(System.in).nextLine());
    }
}
