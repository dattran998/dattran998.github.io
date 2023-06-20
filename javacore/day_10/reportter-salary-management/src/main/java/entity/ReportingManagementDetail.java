package entity;

public class ReportingManagementDetail {
    private PaperType paperType = new PaperType();
    private int paperNumber;

    public ReportingManagementDetail(PaperType paperType, int paperNumber) {
        this.paperType = paperType;
        this.paperNumber = paperNumber;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public void setPaperType(PaperType paperType) {
        this.paperType = paperType;
    }

    public int getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(int paperNumber) {
        this.paperNumber = paperNumber;
    }

    @Override
    public String toString() {
        return "ReportingManagementDetail{" +
                "paperType=" + paperType +
                ", paperNumber=" + paperNumber +
                '}';
    }
}
