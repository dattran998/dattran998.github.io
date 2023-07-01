package entity;

import java.util.Arrays;
import java.util.List;

public class Timesheet {

    private Employee employee = new Employee();
    private List<TimesheetDetail> details;

    public Timesheet(Employee employee, List<TimesheetDetail> details) {
        this.employee = employee;
        this.details = details;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<TimesheetDetail> getDetails() {
        return details;
    }

    public void setDetails(List<TimesheetDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "employee=" + employee +
                ", details=" + details +
                '}';
    }
}
