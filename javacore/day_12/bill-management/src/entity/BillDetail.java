package entity;

public class BillDetail {
    private Service service;
    private int amount;

    public BillDetail(Service service, int amount) {
        this.service = service;
        this.amount = amount;
    }

    public BillDetail() {

    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BillDetail{" +
                "service=" + service +
                ", amount=" + amount +
                '}';
    }

}
