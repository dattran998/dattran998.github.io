package entity;

import java.util.List;
import java.util.Map;

public class Assignment {
    private Driver driver;
    private List<AssignmentDetail> details;
    private int totalRoute;

    public Assignment(Driver driver, List<AssignmentDetail> details, int totalRoute) {
        this.driver = driver;
        this.details = details;
        this.totalRoute = totalRoute;
    }

    public int getTotalRoute() {
        return totalRoute;
    }

    public void setTotalRoute(int totalRoute) {
        this.totalRoute = totalRoute;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<AssignmentDetail> getDetails() {
        return details;
    }

    public void setDetails(List<AssignmentDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "driver=" + driver +
                ", details=" + details +
                '}';
    }
}
