package logichandle;

import entity.PaperType;
import entity.Reporter;
import entity.ReportingManagement;
import entity.ReportingManagementDetail;

import java.util.Scanner;

public class ReportingLogicManagement {
    private ReporterLogicManagement reporterLogicManagement;
    private PaperTypeLogicManagement paperTypeLogicManagement;
    private final ReportingManagement[] reportingManagements = new ReportingManagement[100];

    public ReportingLogicManagement(ReporterLogicManagement reporterLogicManagement, PaperTypeLogicManagement paperTypeLogicManagement) {
        this.reporterLogicManagement = reporterLogicManagement;
        this.paperTypeLogicManagement = paperTypeLogicManagement;
    }

    public  void sortReportingManagement() {
        System.out.println("1. Theo họ tên phóng viên");
        System.out.println("2. Theo số lượng bài viết (giảm dần)");

        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 2) {
                break;
            }
            System.out.println("Giá trị vừa nhập k hợp lệ, vui lòng nhập lại");
        } while (true);

        switch (choice) {
            case 1: {
                for (int i = 0; i < (reportingManagements.length - 1); i++) {
                    ReportingManagement tmp = null;
                    for (int j = i + 1; j < reporterLogicManagement.getReporters().length; j++) {
                        if (reportingManagements[i] != null && reportingManagements[j] != null && compareCharactor(i) < compareCharactor(j)) {
                            tmp = reportingManagements[i];
                            reportingManagements[i] = reportingManagements[j];
                            reportingManagements[j] = tmp;
                        }
                    }
                }

                System.out.println("Bảng tính công sau khi săp xếp: ");
                showReportingManagement();
                break;
            }

            case 2: {

                for (int i = 0; i < (reportingManagements.length - 1); i++) {
                    ReportingManagement tmp = null;
                    for (int j = i + 1; j < reporterLogicManagement.getReporters().length; j++) {
                        if (reportingManagements[i] != null && reportingManagements[j] != null && caculateTotalPaper(i) < caculateTotalPaper(j)) {
                            tmp = reportingManagements[i];
                            reportingManagements[i] = reportingManagements[j];
                            reportingManagements[j] = tmp;
                        }
                    }
                }

                System.out.println("Bảng tính công sau khi săp xếp: ");
                showReportingManagement();
            }
        }
    }

    public  char compareCharactor(int i) {
        char c;
        Reporter reporter = reportingManagements[i].getReporter();
        c = reporter.getName().charAt(0);
        return c;
    }

    public  int caculateTotalPaper(int i) {
        int totalPaper = 0;
        ReportingManagementDetail[] details = reportingManagements[i].getDetails();
        for (int k = 0; k < details.length; k++) {
            totalPaper += details[k].getPaperNumber();
        }
        return totalPaper;
    }

    public  void calculateSalary() {
        for (int i = 0; i < reportingManagements.length; i++) {
            ReportingManagement reportingManagement = reportingManagements[i];
            if (reportingManagement == null) {
                continue;
            }

            Reporter reporter = reportingManagement.getReporter();
            ReportingManagementDetail[] details = reportingManagement.getDetails();

            double salary = 0;
            for (int j = 0; j < details.length; j++) {
                PaperType paperType = details[j].getPaperType();
                salary += details[i].getPaperNumber() * paperType.getPrice();
            }

            System.out.println("Thu nhập của phóng viên " + reporter.getName() + " là " + salary);

        }
    }

    public  void showReportingManagement() {
        for (int i = 0; i < reportingManagements.length; i++) {
            if (reportingManagements[i] != null) {
                System.out.println(reportingManagements[i]);
            }
        }
    }

    public  void inputNewReporting() {
        if (!reporterLogicManagement.reporterIsNotEmpty() || !paperTypeLogicManagement.paperTypeIsNotEmpty()) {
            System.out.println("Không có dữ liệu về phóng viên hoặc kiểu bài viết, vui lòng tạo dữ liệu trước khi lập bảng tính công");
            return;
        }

        System.out.println("Nhập số phóng viên bạn muốn tính công: ");
        int reporterNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhập thông tin phóng viên thứ " + ( i + 1) + " bạn muốn tính công: ");
            System.out.println("Nhập ID phóng viên: ");
            int reportId;
            Reporter reporter = null;
            do {
                reportId = new Scanner(System.in).nextInt();
                for (int j = 0; j < reporterLogicManagement.getReporters().length; j++) {
                    if (reporterLogicManagement.getReporters()[j] != null && reporterLogicManagement.getReporters()[j].getReporterId() == reportId) {
                        reporter = reporterLogicManagement.getReporters()[j];
                        break;
                    }
                }

                if (reporter != null) {
                    break;
                }
                System.out.println("Không tồn tại ID phóng viên vừa nhập, vui lòng nhập lại: ");
            } while (true);

            System.out.println("Phóng viên này viết bao nhiêu kiểu bài viết: ");
            int numberTypePaper;

            do {
                numberTypePaper = new Scanner(System.in).nextInt();
                if (numberTypePaper >= 1 && numberTypePaper <= 5) {
                    break;
                }
                System.out.println("Số kiểu bài không được vượt quá 5");
            } while (true);
            ReportingManagementDetail[] details = new ReportingManagementDetail[numberTypePaper];
            int count = 0;

            for (int j = 0; j < numberTypePaper; j++) {
                System.out.println("Nhập kiểu bài viết thứ " + (j + 1) + " mà phóng viên này viết: ");
                int paperTypeId;
                PaperType paperType = null;
                do {
                    paperTypeId = new Scanner(System.in).nextInt();

                    for (int k = 0; k < paperTypeLogicManagement.getPaperTypes().length; k++) {
                        if (paperTypeLogicManagement.getPaperTypes()[k] != null && paperTypeLogicManagement.getPaperTypes()[k].getPaperTypeId() == paperTypeId) {
                            paperType = paperTypeLogicManagement.getPaperTypes()[k];
                            break;
                        }
                    }

                    if (paperType != null) {
                        break;
                    }
                    System.out.println("Không tồn tại ID vừa nhập, vui lòng nhập lại");
                } while (true);

                System.out.println("Kiểu bài viết này có bao nhiêu bài: ");
                int paperNumber = new Scanner(System.in).nextInt();

                ReportingManagementDetail reportingManagementDetail = new ReportingManagementDetail(paperType, paperNumber);
                details[count] = reportingManagementDetail;
                count++;

            }

            ReportingManagement reportingManagement = new ReportingManagement(reporter, details);
            saveReportingManagement(reportingManagement);

        }
    }

    public  void saveReportingManagement(ReportingManagement reportingManagement) {
        for (int i = 0; i < reportingManagements.length; i++) {
            if (reportingManagements[i] == null) {
                reportingManagements[i] = reportingManagement;
                break;
            }
        }
    }

}
