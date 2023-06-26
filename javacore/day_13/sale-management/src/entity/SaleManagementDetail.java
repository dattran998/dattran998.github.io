package entity;

public class SaleManagementDetail {
    private Merchandise merchandise;
    private int quantitySold;

    public SaleManagementDetail(Merchandise merchandise, int quantitySold) {
        this.merchandise = merchandise;
        this.quantitySold = quantitySold;
    }

    public Merchandise getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public String toString() {
        return "SaleManagementDetail{" +
                "merchandise=" + merchandise +
                ", quantitySold=" + quantitySold +
                '}';
    }
}
