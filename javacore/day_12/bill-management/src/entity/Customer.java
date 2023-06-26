package entity;

import statics.CustomerType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer extends Person {
    private static int AUTO_ID = 10000;

    private int customerId;
    private CustomerType customerType;

    public Customer() {
        this.customerId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerType=" + customerType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Chọn loại khách hàng: ");
        System.out.println("1. Cá nhân");
        System.out.println("2. Đại diện đơn vị hành chính");
        System.out.println("3. Đại diện đơn vị kinh doanh");
        System.out.println("Mời chọn: ");
        int choiceType;
        do {
            try {
                choiceType = new Scanner(System.in).nextInt();
                if (choiceType >= 1 && choiceType <= 3) {
                    break;
                }
                else
                    System.out.println("Số vừa nhập không hợp lệ, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạnh không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        switch (choiceType) {
            case 1: {
                this.setCustomerType(CustomerType.CA_NHAN);
                break;
            }
            case 2: {
                this.setCustomerType(CustomerType.DAI_DIEN_DON_VI_HANH_CHINH);
                break;
            }

            case 3: {
                this.setCustomerType(CustomerType.DAI_DIEN_DON_VI_KINH_DOANH);
                break;
            }
        }
    }

}
