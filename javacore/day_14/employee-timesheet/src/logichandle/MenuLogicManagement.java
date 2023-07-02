package logichandle;

import java.util.Scanner;

public class MenuLogicManagement {

    private final EmployeeLogicManagement employeeLogicManagement = new EmployeeLogicManagement();
    private final FactoryLogicManagement factoryLogicManagement = new FactoryLogicManagement();
    private final TimesheetLogicManagement timesheetLogicManagement = new TimesheetLogicManagement(employeeLogicManagement, factoryLogicManagement);
    public  void menu() {
        do {
            showMenuContent();
            int choice = inputChoice();

            switch (choice) {
                case 1:
                    employeeLogicManagement.inputNewEmployee();
                    break;

                case 2:
                    employeeLogicManagement.showEmployee();
                    break;

                case 3:
                    factoryLogicManagement.inputNewFactory();
                    break;

                case 4:
                    factoryLogicManagement.showFactory();
                    break;

                case 5:
                    timesheetLogicManagement.inputNewTimesheet();
                    break;
                case 6:
                    timesheetLogicManagement.showTimesheet();
                    break;

                case 7:
                    showSortMenu();
                    break;

                case 8:
                    timesheetLogicManagement.calculateSalary();
                    break;

                case 9:

                    return;


            }


        } while (true);
    }



    public  void showSortMenu() {
        System.out.println("1. Sắp xếp theo tên công nhân");
        System.out.println("2. Sắp xếp theo xưởng");
        System.out.println("3. Trở về menu chính");
        System.out.println("Mời chọn: ");

        int subChoice = inputSubChoice();

        switch (subChoice) {
            case 1:
                timesheetLogicManagement.sortByName();
                break;

            case 2:

                break;

            case 3:

                return;
        }
    }




    public  int inputSubChoice() {
        int subChoice;
        do {
            try {
                subChoice = new Scanner(System.in).nextInt();
                if (subChoice >= 1 && subChoice <= 3) {
                    break;
                }
                else
                    System.out.println("Lựa chọn từ 1 đến 3, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        return subChoice;
    }









    public  int inputChoice() {
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 9) {
                    break;
                }
                else
                    System.out.println("Lựa chọn từ 1 đến 9, vui lòng nhập lại: ");
            } catch (Exception e) {
                System.out.println("Nhập không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        return choice;
    }

    public  void showMenuContent() {
        System.out.println("============BẢNG DANH SÁCH CHẤM CÔNG============");
        System.out.println("1. Nhập danh sách công nhân mới");
        System.out.println("2. In ra danh sách công nhân đã có");
        System.out.println("3. Nhập danh sách xưởng sản xuất ");
        System.out.println("4. In ra danh sách xưởng đã có");
        System.out.println("5. Lập bảng danh sách chấm công");
        System.out.println("6. In ra bảng danh sách chấm công");
        System.out.println("7. Sắp xếp bảng danh sách chấm công");
        System.out.println("8. Lập bảng kê thu nhập mỗi công nhân trong tháng");
        System.out.println("9. Thoát chương trình");
        System.out.println("Mời chọn: ");
    }
}
