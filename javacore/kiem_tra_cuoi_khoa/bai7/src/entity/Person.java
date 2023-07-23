package entity;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String phone;

    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfor() {

        System.out.println("Nhập họ tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại: ");
        this.setPhone(new Scanner(System.in).nextLine());

    }
}
