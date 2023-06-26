package statics;

public enum GroupOfMerchandise {
    DIEN_TU ("Điện tử"),
    DIEN_LANH ("Điện lạnh"),
    MAY_TINH ("Máy tính"),
    THIET_BI_VAN_PHONG ("Thiết bị văn phòng");

    public String name;

    GroupOfMerchandise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
