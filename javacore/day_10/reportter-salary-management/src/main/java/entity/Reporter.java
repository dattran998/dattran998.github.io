package entity;

import statics.ReporterType;

import java.util.Scanner;

public class Reporter extends Person {
    public static int AUTO_ID = 10000;

    private int reporterId;
    private ReporterType reporterType;

    public Reporter() {
        this.reporterId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getReporterId() {
        return reporterId;
    }

    public void setReporterId(int reporterId) {
        this.reporterId = reporterId;
    }

    public ReporterType getReporterType() {
        return reporterType;
    }

    public void setReporterType(ReporterType reporterType) {
        this.reporterType = reporterType;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "reporterId=" + reporterId +
                ", reporterType=" + reporterType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập loại phóng viên: ");
        System.out.println("1. Chuyên nghiệp");
        System.out.println("2.Nghiệp dư");
        System.out.println("3. Cộng tác viên");

        System.out.println("Chọn loại phóng viên: ");
        int choiceTypeReporter;

        do {
            choiceTypeReporter = new Scanner(System.in).nextInt();
            if (choiceTypeReporter >= 1 && choiceTypeReporter <= 3) {
                break;
            }
            System.out.println("Giá trị vừa chọn không hợp lê, vui lòng chọn lại: ");
        } while (true);

        switch (choiceTypeReporter) {
            case 1:
                this.setReporterType(ReporterType.CHUYEN_NGHIEP);
                break;
            case 2:
                this.setReporterType(ReporterType.NGHIEP_DU);
                break;
            case 3:
                this.setReporterType(ReporterType.CONG_TAC_VIEN);
        }
    }
}
