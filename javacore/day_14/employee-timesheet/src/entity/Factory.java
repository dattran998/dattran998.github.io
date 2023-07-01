package entity;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Factory {
    private static int AUTO_ID = 100;

    private int factoryId;
    private String factoryName;
    private String describe;
    private double coefficient;
    
    public Factory() {
        this.factoryId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryId=" + factoryId +
                ", factoryName='" + factoryName + '\'' +
                ", describe='" + describe + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }

    public void inputInfo() {
        System.out.println("Nhập tên xưởng: ");
        this.setFactoryName(new Scanner(System.in).nextLine());
        System.out.println("Nhập mô tả: ");
        this.setDescribe(new Scanner(System.in).nextLine());
        System.out.println("nhập hệ số công việc là số thực từ 1 đến 20: ");
        do {
            try {
                this.setCoefficient(new Scanner(System.in).nextDouble());
                if (this.getCoefficient() >= 1 && this.getCoefficient() <= 20) {
                    break;
                }
                else
                    System.out.println("Hệ số công việc phải là 1 số thực từ 1 đến 20, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
    }
}
