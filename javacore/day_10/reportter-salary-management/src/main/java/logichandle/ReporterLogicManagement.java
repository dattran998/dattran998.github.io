package logichandle;

import entity.Reporter;

import java.util.Scanner;

public class ReporterLogicManagement {
    private Reporter[] reporters = new Reporter[100];

    public Reporter[] getReporters() {
        return reporters;
    }

    public boolean reporterIsNotEmpty() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null)
                return true;
        }
        return false;
    }

    public void showReporter() {
        for(int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                System.out.println(reporters[i]);
            }
        }
    }

    public void inputNewReporter() {
        System.out.println("Bạn muốn thêm mới bao nhiêu phóng viên: ");
        int reporterNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhập thông tin của phóng viên thứ " + (i + 1) +":");
            Reporter reporter = new Reporter();
            reporter.inputInfo();
            saveReporter(reporter);
        }
    }

    public void saveReporter(Reporter reporter) {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] == null) {
                reporters[i] = reporter;
                break;
            }
        }
    }
}
