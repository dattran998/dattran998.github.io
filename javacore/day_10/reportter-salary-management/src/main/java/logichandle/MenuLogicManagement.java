package logichandle;

import java.util.Scanner;

public class MenuLogicManagement {
    private final ReporterLogicManagement reporterLogicManagement = new ReporterLogicManagement();
    private final PaperTypeLogicManagement paperTypeLogicManagement = new PaperTypeLogicManagement();
    private final ReportingLogicManagement reportingLogicManagement = new ReportingLogicManagement(reporterLogicManagement, paperTypeLogicManagement);
    public void menu() {
        while (true) {
            System.out.println("===============CHƯƠNG TRÌNH QUẢN LÝ LƯƠNG CỦA PHÓNG VIÊN=============");
            System.out.println("1. Nhập danh sách của phóng viên");
            System.out.println("2. In ra danh sách phóng viên đang có");
            System.out.println("3. Nhập danh sách kiểu bài viết");
            System.out.println("4. In ra danh sách kiểu bài viết đó");
            System.out.println("5. Lập bảng tính công cho phóng viên");
            System.out.println("6. In bảng tính công cho phóng viên");
            System.out.println("7. Sắp xếp bảng tính công");
            System.out.println("8. Lập bảng kê thu nhập cho mỗi phóng viên");
            System.out.println("9. Thoát");
            System.out.println("Chọn: ");

            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 9) {
                    break;
                }
                System.out.println("Giá trị vừa nhập k hợp lệ, vui lòng nhập lại");
            } while (true);

            switch (choice) {
                case 1: {
                    reporterLogicManagement.inputNewReporter();
                    break;
                }

                case 2: {
                    reporterLogicManagement.showReporter();
                    break;
                }

                case 3: {
                    paperTypeLogicManagement.inputNewPaperType();
                    break;
                }

                case 4: {
                    paperTypeLogicManagement.showPaperType();
                    break;
                }

                case 5: {
                    reportingLogicManagement.inputNewReporting();
                    break;
                }

                case 6: {
                    reportingLogicManagement.showReportingManagement();
                    break;
                }

                case 7: {
                    reportingLogicManagement.sortReportingManagement();
                    break;
                }

                case 8: {
                    reportingLogicManagement.calculateSalary();
                    break;
                }

                case 9: {
                    return;
                }
            }
        }
    }
}
