package entity;

import java.util.Scanner;

public class PaperType {
    public static int AUTO_ID = 100;

    private int paperTypeId;
    private String namePaper;
    private double price;

    public PaperType() {
        this.paperTypeId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getPaperTypeId() {
        return paperTypeId;
    }

    public void setPaperTypeId(int paperId) {
        this.paperTypeId = paperId;
    }

    public String getNamePaper() {
        return namePaper;
    }

    public void setNamePaper(String namePaper) {
        this.namePaper = namePaper;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "paperTypeId=" + paperTypeId +
                ", namePaper='" + namePaper + '\'' +
                ", price=" + price +
                '}';
    }

    public void inputInfo() {
        System.out.println("Nhập tên kiểu bài: ");
        this.setNamePaper(new Scanner(System.in).nextLine());
        System.out.println("Nhập đơn giá: ");
        this.setPrice(new Scanner(System.in).nextDouble());
    }
}
