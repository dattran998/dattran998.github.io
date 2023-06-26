package logichandle;

import entity.Bill;
import entity.BillDetail;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLogic {

    private final CustomerLogic customerLogic = new CustomerLogic();
    private final ServiceLogic serviceLogic = new ServiceLogic();

    private final BillLogic billLogic = new BillLogic(customerLogic, serviceLogic);
    public void menu() {
        do {
            showMenu();
            System.out.println("Mời chọn: ");

            int choice;
            do {
                try {
                    choice = new Scanner(System.in).nextInt();
                    if (choice >= 1 && choice <= 9) {
                        break;
                    } else
                        System.out.println("Số vừa nhập không hợp lệ, vui lòng nhập lại");
                } catch (InputMismatchException e) {
                    System.out.println("Định dạnh không hợp lệ, vui lòng nhập lại");
                }
            } while (true);

            switch (choice) {
                case 1: {
                    customerLogic.inputNewCustomer();
                    break;
                }

                case 2: {
                    customerLogic.showCustomer();
                    break;
                }

                case 3: {
                    serviceLogic.inputNewService();
                    break;
                }

                case 4: {
                    serviceLogic.showService();
                    break;
                }

                case 5: {
                    billLogic.inputNewBill();
                    break;
                }

                case 6: {
                    billLogic.showBill();
                    break;
                }

                case 7: {
                    submenu();
                    break;
                }

                case 8: {
                    costCalculation();
                    break;
                }

                case 9: {
                    return;
                }
            }
        } while (true);

    }

    public void costCalculation() {
        for (int i = 0; i < billLogic.getBills().length; i++) {
            int cost = 0;
            if (billLogic.getBills()[i] != null) {
                for (int j = 0; j < billLogic.getBills()[i].getDetails().length; j++) {
                    cost += billLogic.getBills()[i].getDetails()[j].getService().getCharges() * billLogic.getBills()[i].getDetails()[j].getAmount();
                }
                System.out.println("Số tiền phải trả của khách hàng " + billLogic.getBills()[i].getCustomer().getName() + " là " + cost);
            }

        }
    }

    public void submenu() {
        System.out.println("1. Sắp xếp theo họ tên khách hàng: ");
        System.out.println("2. Sắp xếp theo số lượng sử dụng (giảm dần)");
        System.out.println("3. Quay lại menu tổng");

        int choice;

        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 2) {
                    break;
                } else
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
            } catch (InputMismatchException e) {
                System.out.println("Định dạnh không hợp lệ, vui lòng nhập lại");
            }

        } while (true);

        switch (choice) {
            case 1: {
                billLogic.sortByName();
                billLogic.showBill();
                break;
            }

            case 2: {
                billLogic.sortByAmount();
                billLogic.showBill();
                break;
            }

            case 3:
                return;

        }


    }




    public void showMenu() {
        System.out.println("=============CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN DỊCH VỤ==============");
        System.out.println("1. Nhập danh sách khách hàng");
        System.out.println("2. In danh sách khách hàng đã có");
        System.out.println("3. Nhập danh sách dịch vụ");
        System.out.println("4. In danh sách dịch vụ đã có");
        System.out.println("5. Nhập hóa đơn khách hàng");
        System.out.println("6. In ra danh sách hóa đơn");
        System.out.println("7. Sắp xếp dnah sách hóa đơn");
        System.out.println("8. Lập bảng kê số tiền trả của mỗi khách hàng");
        System.out.println("9. Thoát");
    }
    
}
