package logichandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManagement {
    private final DriverManagement driverManagement = new DriverManagement();
    private final RouteManagement routeManagement = new RouteManagement();
    private final AssignmentManagement assignmentManagement = new AssignmentManagement(driverManagement, routeManagement);

    public void menu() {
        while (true) {
            showMenu();
            int choice = inputChoiceMenu();
            switch (choice) {
                case 1:
                    driverManagement.inputNewDriver();
                    break;

                case 2:
                    driverManagement.showDriver();
                    break;

                case 3:
                    routeManagement.inputNewRoute();
                    break;

                case 4:
                    routeManagement.showRoute();
                    break;

                case 5:
                    assignmentManagement.inputNewAssignment();
                    break;

                case 6:
                    assignmentManagement.showAssignment();
                    break;

                case 7:
                    sortMenu();
                    break;

                case 8:
                    assignmentManagement.calculateTotalDistance();
                    break;

                case 9:
                    return;
            }
        }
    }

    private void sortMenu() {
        System.out.println("Sắp xếp danh sách phân công");
        System.out.println("1. Theo họ tên lái xe");
        System.out.println("2. Theo số lượng tuyến đảm nhận trong ngày (giảm dần)");
        System.out.println("3. Quay lại menu chính");
        System.out.println("Lựa chọn: ");

        int choice;

        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng chọn lại!");
            }
        } while (true);

        switch (choice) {
            case 1:
                assignmentManagement.sortByName();
                assignmentManagement.showAssignment();
                break;

            case 2:
                assignmentManagement.sortByRoute();
                assignmentManagement.showAssignment();
                break;

            case 3:
                return;
        }
    }

    private int inputChoiceMenu() {
        int n;
        do {
            try {
                n = new Scanner(System.in).nextInt();
                if (n >= 1 && n <= 9) {
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng chọn lại!");
            }
        } while (true);
        return n;
    }

    public void showMenu() {
        System.out.println("============ Chương trình quản lý lái xe =============");
        System.out.println("1. Nhập danh sách Lái xe mới");
        System.out.println("2. In ra danh sách Lái xe");
        System.out.println("3. Nhập danh sách tuyến mới");
        System.out.println("4. In ra danh sách tuyến");
        System.out.println("5. Nhập danh sách phân công cho mỗi lái xe");
        System.out.println("6. In ra danh sách phân công");
        System.out.println("7. Sắp xếp danh sách phân công");
        System.out.println("8. Lập bảnh thống kê khoảng cách chạy xe mỗi ngày của mỗi lái xe");
        System.out.println("9. Thoát");
        System.out.println("Mời lụa chọn: ");
    }
}
