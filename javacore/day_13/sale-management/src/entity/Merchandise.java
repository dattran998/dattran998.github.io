package entity;

import statics.GroupOfMerchandise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Merchandise implements InputInfo {
    private static int AUTO_ID = 1000;

    private int merchandiseId;
    private String nameMerchandise;
    private GroupOfMerchandise groupOfMerchandise;
    private double price;
    private int quantity;

    public Merchandise() {
        this.merchandiseId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(int merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public String getNameMerchandise() {
        return nameMerchandise;
    }

    public void setNameMerchandise(String nameMerchandise) {
        this.nameMerchandise = nameMerchandise;
    }

    public GroupOfMerchandise getGroupOfMerchandise(GroupOfMerchandise dienTu) {
        return groupOfMerchandise;
    }

    public void setGroupOfMerchandise(GroupOfMerchandise groupOfMerchandise) {
        this.groupOfMerchandise = groupOfMerchandise;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "merchandiseId=" + merchandiseId +
                ", nameMerchandise='" + nameMerchandise + '\'' +
                ", groupOfMerchandise='" + groupOfMerchandise + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void inputInfo() {

        System.out.println("Nhập tên mặt hàng: ");
        this.setNameMerchandise(new Scanner(System.in).nextLine());
        System.out.println("Lựa chọn nhóm hàng: ");

        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");

        System.out.println("Mời lựa chọn: ");

        int choiceType;
        do {
            try {
                choiceType = new Scanner(System.in).nextInt();

                if (choiceType  >= 1 && choiceType <= 4) {
                    break;
                } else
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        switch (choiceType) {
            case 1:
                this.setGroupOfMerchandise(GroupOfMerchandise.DIEN_TU);
                break;

            case 2:
                this.setGroupOfMerchandise(GroupOfMerchandise.DIEN_LANH);
                break;

            case 3:
                this.setGroupOfMerchandise(GroupOfMerchandise.MAY_TINH);
                break;

            case 4:
                this.setGroupOfMerchandise(GroupOfMerchandise.THIET_BI_VAN_PHONG);
                break;
        }

        System.out.println("Nhập giá bán: ");
        do {
            try {
                this.setPrice(new Scanner(System.in).nextDouble());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        System.out.println("Nhập  số lượng: ");
        do {
            try {
                this.setQuantity(new Scanner(System.in).nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Định dạng vừa nhập không hợp lệ, vui lòng nhập lại");
            }
        } while (true);
    }
}
