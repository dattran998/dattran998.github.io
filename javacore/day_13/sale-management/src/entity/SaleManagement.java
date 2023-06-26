package entity;

import java.util.Arrays;

public class SaleManagement {

    private Staff staff;
    private SaleManagementDetail[] details ;

    public SaleManagement(Staff staff, SaleManagementDetail[] details) {
        this.staff = staff;
        this.details = details;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public SaleManagementDetail[] getDetails() {
        return details;
    }

    public void setDetails(SaleManagementDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "SaleManagement{" +
                "staff=" + staff +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
