package logichandle;

import entity.Bill;
import entity.BillDetail;
import entity.Customer;
import entity.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BillLogic {

    private Bill[] bills = new Bill[100];
    private ServiceLogic serviceLogic;
    private CustomerLogic customerLogic;

    public BillLogic(CustomerLogic customerLogic, ServiceLogic serviceLogic) {
        this.customerLogic = customerLogic;
        this.serviceLogic = serviceLogic;
    }


    public Bill[] getBills() {
        return bills;
    }

    public void showBill() {
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] != null)
                System.out.println(bills[i]);
        }
    }

    public void inputNewBill() {

        if (!serviceLogic.isHasService(serviceLogic.getServices()) || !customerLogic.isHasCustomer(customerLogic.getCustomers())) {
            System.out.println("Chưa có dữ liệu, vui lòng nhập dữ liệu");
            return;
        }

        System.out.println("Nhập số lượng bill bạn muốn thêm vào: ");
        int billNumber;

        do {
            try {
                billNumber = new Scanner(System.in).nextInt();
                if (billNumber >= 1) {
                    break;
                } else
                    System.out.println("Số lượng bill phải lớn hơn hoặc bằng 1");
            } catch (InputMismatchException e) {
                System.out.println("Định dạnh không hợp lệ, vui lòng nhập lại");
            }

        } while (true);

        for (int i = 0; i < billNumber; i++) {
            System.out.println("Nhập thông tin hóa đơn thứ " + (i + 1));
            int customerId;
            Customer customer = null;

            do {
                try {
                    System.out.println("Nhập ID khách hành thứ " + (i + 1));
                    customerId = new Scanner(System.in).nextInt();

                    for(int j = 0; j < customerLogic.getCustomers().length; j++) {
                        if (customerLogic.getCustomers()[j] != null && (customerId == customerLogic.getCustomers()[j].getCustomerId())) {
                            customer = customerLogic.getCustomers()[j];
                            break;
                        }
                    }

                    if (customer != null) {
                        break;
                    } else
                        System.out.println("Id vừa nhập không hợp lệ, vui lòng nhập lại");
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                }

            } while (true);

            System.out.println("Khách hàng thứ " + (i + 1) + " sử dụng bao nhiêu dịch vụ: ");
            int serviceNumber;

            do {
                try {
                    serviceNumber = new Scanner(System.in).nextInt();
                    if (serviceNumber >= 1 && serviceNumber <= 5) {
                        break;
                    } else
                        System.out.println("Khách hàng không được sử dụng quá 5 loại dịch vụ, vui lòng nhập lại: ");
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                }
            } while (true);

            BillDetail[] details = new BillDetail[serviceNumber];
            int count = 0;
            for (int j = 0; j < serviceNumber; j++) {
                System.out.println("Nhập thông tin dịch vụ thứ " + (j + 1));
                int serviceId;
                Service service = null;

                do {
                    try {
                        System.out.println("Nhập ID dịch vụ thứ " + (j + 1));
                        serviceId = new Scanner(System.in).nextInt();

                        for(int k = 0; k < serviceLogic.getServices().length; k++) {
                            if (serviceLogic.getServices()[k] != null && serviceId == serviceLogic.getServices()[k].getServiceId()) {
                                service = serviceLogic.getServices()[k];
                                break;
                            }
                        }

                        if (service != null) {
                            break;
                        } else
                            System.out.println("Id vừa nhập không hợp lệ, vui lòng nhập lại");
                    } catch (InputMismatchException e) {
                        System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                    }

                } while (true);

                int amount;
                do {
                    try {
                        System.out.println("Nhập số lượng sử dụng của dịch vụ thứ " + (j + 1));
                        amount = new Scanner(System.in).nextInt();
                        if (amount >= 1) {
                            break;
                        } else
                            System.out.println("Số lượng sử dụng phải lớn hơn 1, vui lòng nhập lại: ");
                    } catch (InputMismatchException e) {
                        System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                    }
                } while (true);

                BillDetail billDetail = new BillDetail(service, amount);
                details[count] = billDetail;
                count++;
            }

            Bill bill = new Bill(customer, details);
            saveBill(bill);

        }

    }

    public void saveBill(Bill bill) {
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == null) {
                bills[i] = bill;
                break;
            }
        }
    }

    public void sortByAmount() {
        if (billIsEmpty()) {
            System.out.println("Chưa có dữ liệu để sắp xếp ");
            return;
        }

        Bill bill;
        for(int i = 0; i < bills.length - 1; i++) {

            for (int j = 0; j < bills.length; j++) {
                if (bills[i] != null && bills[j] != null && (sumOfAmount(bills[i]) > sumOfAmount(bills[j]))) {
                    bill = bills[i];
                    bills[i] = bills[j];
                    bills[j] = bill;
                }
            }
        }
    }

    public int sumOfAmount(Bill bill) {
        int sum = 0;
        for (int i = 0; i < bill.getDetails().length; i++) {
            sum += bill.getDetails()[i].getAmount();
        }
        return sum;
    }

    public void sortByName() {
        if (billIsEmpty()) {
            System.out.println("Chưa có dữ liệu để sắp xếp");
            return;
        }

        Bill bill;
        for (int i = 0; i < bills.length -1; i++) {
            for(int j = i + 1; j < bills.length; j++) {
                if (bills[i] != null && bills[j] != null && (bills[i].getCustomer().getName().charAt(0) > bills[j].getCustomer().getName().charAt(0)) ) {
                    bill = bills[i];
                    bills[i] = bills[j];
                    bills[j] = bill;
                }
            }
        }
    }

    private boolean billIsEmpty() {
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] != null) {
                return false;
            }
        }
        return true;
    }

}
