package logichandle;

import entity.Customer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerLogic {
    private   Customer[] customers = new Customer[100];

    public Customer[] getCustomers() {
        return customers;
    }

    public  void showCustomer() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null)
                System.out.println(customers[i]);
        }
    }

    public  void inputNewCustomer() {
        System.out.println("Bạn muốn thêm mới bao nhiêu khách hàng: ");
        int customerNumber;

        do {
            try {
                customerNumber = new Scanner(System.in).nextInt();
                if (customerNumber >= 1) {
                    break;
                } else
                    System.out.println("Số khách hàng thêm mới phaiar lớn hơn hoặc bằng 1");
            } catch (InputMismatchException e) {
                System.out.println("Định dạnh không hợp lệ, vui lòng nhập lại");
            }

        } while (true);

        for (int i = 0; i < customerNumber ; i++) {
            System.out.println("Nhập thông tin khách hàng thứ " + (i + 1));
            Customer customer = new Customer();
            customer.inputInfo();

            saveCustomer(customer);
        }
    }

    public  void saveCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
            }
        }
    }

    public boolean isHasCustomer(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                return true;
            }
        }
        return false;
    }

}
