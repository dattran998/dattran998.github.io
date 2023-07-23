package entity;

public class AssignmentDetail {
    private Route route;
    private int quantity;

    public Route getRoute() {
        return route;
    }

    public AssignmentDetail(Route route, int quantity) {
        this.route = route;
        this.quantity = quantity;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "AssignmentDetail{" +
                "route=" + route +
                ", quantity=" + quantity +
                '}';
    }
}
