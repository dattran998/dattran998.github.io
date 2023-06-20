package entity;

import java.util.Arrays;

public class ReportingManagement {
    private Reporter reporter;
    private ReportingManagementDetail[] details;

    public ReportingManagement(Reporter reporter, ReportingManagementDetail[] details) {
        this.reporter = reporter;
        this.details = details;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public ReportingManagementDetail[] getDetails() {
        return details;
    }

    public void setDetails(ReportingManagementDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ReportingManagement{" +
                "reporter=" + reporter +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
