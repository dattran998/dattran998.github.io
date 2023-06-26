package main;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import entity.Merchandise;
import entity.SaleManagement;
import entity.SaleManagementDetail;
import entity.Staff;
import statics.GroupOfMerchandise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Merchandise[] merchandises = new Merchandise[100];
    private static Staff[] staffs = new Staff[100];
    private static SaleManagement[] saleManagements = new SaleManagement[100];

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        do {
            showMenuContent();

            int choice = inputChoice();

            switch (choice) {
                case 1:
                    inputNewMerchandise();
                    break;

                case 2:
                    showMerchandise();
                    break;

                case 3:
                    inputNewStaff();
                    break;

                case 4:
                    showStaff();
                    break;

                case 5:

                    inputNewSaleManagemnet();
                    break;

                case 6:

                    showSaleManagement();
                    break;

                case 7:
                    sortMenu();
                    break;

                case 8:
                    calculateRevenue();
                    break;

                case 9:
                    return;
            }
        } while (true);
    }

    private static void calculateRevenue() {
        for(int i = 0; i < saleManagements.length; i++) {
            int revenue = 0;
            if (saleManagements[i] != null) {
                for (int j = 0; j < saleManagements[i].getDetails().length; j++) {
                    revenue += saleManagements[i].getDetails()[j].getQuantitySold() * saleManagements[i].getDetails()[j].getMerchandise().getPrice();
                }
                System.out.println("Doanh thu bán hàng của nhân viên " + saleManagements[i].getStaff().getName() + " là: " + revenue);

            }
        }
    }

    private static void sortMenu() {
        System.out.println("1. Sắp xếp theo tên nhân viên");
        System.out.println("2. Sắp xếp theo nhóm mặt hàng");
        System.out.println("3. Trở về menu chính ");

        int subChoice = inputSubChoice();

        switch (subChoice) {
            case 1:
                sortByName();
                break;

            case 2:
//                sortByGroupMerchandise();
                break;

            case 3:

                return;
        }
    }

//    private static void sortByGroupMerchandise() {
//        if (staffIsEmpty() || machandiseIsEmpty()) {
//            System.out.println("Không có dữ liệu");
//            return;
//        }
//
//        for (int i = 0; i < saleManagements.length - 1; i++) {
//            if (saleManagements[i] != null) {
//                for (int j = 0; j < saleManagements[i].getDetails().length; j++) {
//                    if (saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise().equals(saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise(GroupOfMerchandise.DIEN_TU))) {
//                        System.out.println("=============ĐIỆN TỬ============");
//                        System.out.println(saleManagements[i]);
//                    } else if (saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise().equals(saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise(GroupOfMerchandise.DIEN_LANH))) {
//                        System.out.println("============ĐIỆN LẠNH==========");
//                        System.out.println(saleManagements[i]);
//                    } else if (saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise().equals(saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise(GroupOfMerchandise.THIET_BI_VAN_PHONG))) {
//                        System.out.println("=========THIẾT BỊ VĂN PHÒNG==========");
//                        System.out.println(saleManagements[i]);
//                    } else if (saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise().equals(saleManagements[i].getDetails()[j].getMerchandise().getGroupOfMerchandise(GroupOfMerchandise.MAY_TINH))) {
//                        System.out.println("==========MÁY TÍNH========");
//                        System.out.println(saleManagements[i]);
//                    }
//                }
//            }
//
//        }
//
//        showSaleManagement();
//    }

    private static void sortByName() {
        if (staffIsEmpty() || machandiseIsEmpty()) {
            System.out.println("Không có dữ liệu");
            return;
        }

        for (int i = 0; i < saleManagements.length - 1; i++) {
            for (int j = 0; j < saleManagements.length; j++) {
                if (saleManagements[i] != null && saleManagements[j] != null && (saleManagements[i].getStaff().getName().compareToIgnoreCase(saleManagements[j].getStaff().getName()) < 0)) {
                    SaleManagement saleManagement = saleManagements[i];
                    saleManagements[i] = saleManagements[j];
                    saleManagements[j] = saleManagement;
                }
            }
        }

        showSaleManagement();
    }

    private static int inputSubChoice() {
        int subChoice;
        do {
            try {
                subChoice = new Scanner(System.in).nextInt();

                if (subChoice >= 1 && subChoice <= 3) {
                    break;
                } else
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhaaoj không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return subChoice;
    }

    private static void showSaleManagement() {
        for (int i = 0; i < saleManagements.length; i++) {
            if (saleManagements[i] != null) {
                System.out.println(saleManagements[i]);
            }
        }
    }

    private static void inputNewSaleManagemnet() {
        if (staffIsEmpty() || machandiseIsEmpty()) {
            System.out.println("Không có dữ liệu");
            return;
        }

        System.out.println("Bạn muốn thêm mới bao nhiêu nhân viên vào danh sách bán hàng: ");
        int saleManagementNumber = inputNumberOfNewsaleManagement();

        for (int i = 0; i < saleManagementNumber; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");

            System.out.println("Nhập ID nhân viên thứ " + (i + 1));

            Staff staff = null;
            int staffId;

            do {
                try {
                    staffId = new Scanner(System.in).nextInt();

                    for (int j = 0; j < staffs.length; j++) {
                        if (staffs[j] != null && (staffId == staffs[j].getStaffId())) {
                            staff = staffs[j];
                            break;
                        }
                    }

                    if (staff != null) {
                        break;
                    } else
                        System.out.println("ID vừa nhập không hợp lệ, vui lòng nhập lại");
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
                }
            } while (true);

            System.out.println("Nhân viên thứ " + (i + 1) + " bán bao nhiêu mặt hàng: ");
            int merchandiseNumber = inputNumberOfMerchandiseSale();

            SaleManagementDetail[] details = new SaleManagementDetail[merchandiseNumber];
            int count = 0;

            for (int j = 0; j < merchandiseNumber; j++) {
                System.out.println("Nhập thông tin mặt hàng thứ " + (j + 1) + ":");

                System.out.println("Nhập ID mặt hàng thứ " + (j + 1));

                Merchandise merchandise = null;
                int merchandiseId;
                do {
                    try {
                        merchandiseId = new Scanner(System.in).nextInt();

                        for (int k = 0; k < merchandises.length; k++) {
                            if (merchandises[k] != null && (merchandiseId == merchandises[k].getMerchandiseId())) {
                                merchandise = merchandises[k];
                                break;
                            }
                        }

                        if (merchandise != null) {
                            break;
                        } else
                            System.out.println("ID vừa nhập không hợp lệ, vui lòng nhập lại");
                    } catch (InputMismatchException e) {
                        System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
                    }
                } while (true);

                System.out.println("Mặt hàng này bán được bao nhiêu sản phẩm: ");

                int quantitySold = inputQuantitySold();

                SaleManagementDetail saleManagementDetail = new SaleManagementDetail(merchandise, quantitySold);
                details[count] = saleManagementDetail;
                count++;
            }

            SaleManagement saleManagement = new SaleManagement(staff, details);

            saveSaleManagement(saleManagement);

        }
    }

    private static void saveSaleManagement(SaleManagement saleManagement) {
        for (int i = 0; i < saleManagements.length; i++) {
            if (saleManagements[i] == null) {
                saleManagements[i] = saleManagement;
                break;
            }
        }
    }

    private static int inputQuantitySold() {
        int quantitySold;
        do {
            try {
                quantitySold = new Scanner(System.in).nextInt();

                if (quantitySold >= 1) {
                    break;
                } else
                    System.out.println("Số lượng sản phẩn bán được mỗi mặt hàng phải là số dương, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return quantitySold;
    }

    private static int inputNumberOfMerchandiseSale() {
        int merchandiseNumber;
        do {
            try {
                merchandiseNumber = new Scanner(System.in).nextInt();

                if (merchandiseNumber >= 1 && merchandiseNumber <= 5) {
                    break;
                } else
                    System.out.println("Số mặt hàng mỗi nhân viên bán phải là số dương không quá 5, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return merchandiseNumber;
    }

    private static int inputNumberOfNewsaleManagement() {
        int saleManagementNumber;
        do {
            try {
                saleManagementNumber = new Scanner(System.in).nextInt();

                if (saleManagementNumber >= 1) {
                    break;
                } else
                    System.out.println("Số lượng nhân viên thêm vào danh sách bán hàng phải lớn hơn 0, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return saleManagementNumber;
    }

    private static boolean staffIsEmpty() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] != null)
                return false;
        }
        return true;
    }

    private static boolean machandiseIsEmpty() {
        for (int i = 0; i < merchandises.length; i++) {
            if (merchandises[i] != null)
                return false;
        }
        return true;
    }

    private static void showStaff() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] != null) {
                System.out.println(staffs[i]);
            }
        }
    }

    private static void inputNewStaff() {
        System.out.println("Bạn muốn thêm mới bao nhiêu nhân viên: ");
        int staffNumber = inputNumberOfStaff();

        for (int i = 0; i < staffNumber; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            Staff staff = new Staff();

            staff.inputInfo();

            saveStaff(staff);
        }
    }

    private static void saveStaff(Staff staff) {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] == null) {
                staffs[i] = staff;
                break;
            }
        }
    }

    private static int inputNumberOfStaff() {
        int staffNumber;
        do {
            try {
                staffNumber = new Scanner(System.in).nextInt();

                if (staffNumber >= 1) {
                    break;
                } else
                    System.out.println("Số lượng nhân viên thêm mới phải lớn hơn 0, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return staffNumber;
    }

    private static void showMerchandise() {
        for (int i = 0; i < merchandises.length; i++) {
            if (merchandises[i] != null) {
                System.out.println(merchandises[i]);

            }
        }
    }

    private static void inputNewMerchandise() {
        System.out.println("Bạn muốn thêm mới bao nhiêu mặt hàng: ");
        int merchandiseNumber = inputNumberOfMerchandise();

        for (int i = 0; i < merchandiseNumber; i++) {
            System.out.println("Nhập thông tin mặt hàng thứ " + (i + 1) + ":");
            Merchandise merchandise = new Merchandise();

            merchandise.inputInfo();

            saveMerchandise(merchandise);
        }
    }

    private static void saveMerchandise(Merchandise merchandise) {
        for (int i = 0; i < merchandises.length; i++) {
            if (merchandises[i] == null) {
                merchandises[i] = merchandise;
                break;
            }
        }
    }

    private static int inputNumberOfMerchandise() {
        int merchandiseNumber;
        do {
            try {
                merchandiseNumber = new Scanner(System.in).nextInt();

                if (merchandiseNumber >= 1) {
                    break;
                } else
                    System.out.println("Số lượng mặt hàng thêm mới phải lớn hơn 0, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return merchandiseNumber;
    }

    private static int inputChoice() {
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();

                if (choice >= 1 && choice <= 9) {
                    break;
                } else
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhaaoj không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        return choice;
    }

    private static void showMenuContent() {
        System.out.println("==========CHƯƠNG TRÌNH QUẢN LÝ DANH SÁCH BÁN HÀNG=========");

        System.out.println("1. Nhập danh sách mặt hàng mới");
        System.out.println("2. In danh sách mặt hàng dã có");
        System.out.println("3. Nhập danh sách nhân viên mới");
        System.out.println("4. In danh sách nhân viên đã có");
        System.out.println("5. Lập bảng danh sách bán hàng");
        System.out.println("6. In ra danh sách bán hàng");
        System.out.println("7. Sắp xếp danh sách bán hàng");
        System.out.println("8. Lập bảng doanh thu cho mỗi nhân viên");
        System.out.println("9. Thoát chương trình");
        System.out.println("Mới nhập: ");

    }
}
