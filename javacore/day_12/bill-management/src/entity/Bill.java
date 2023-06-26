package entity;

import java.util.Arrays;

public class Bill {
    private Customer customer;
    private BillDetail[] details;

    public Bill(Customer customer, BillDetail[] details) {
        this.customer = customer;
        this.details = details;
    }

    public Bill() {

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillDetail[] getDetails() {
        return details;
    }

    public void setDetails(BillDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer.toString() +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
