package entity;

import statics.ReaderType;

import java.util.Scanner;

public class Reader extends Person {
    public static int AUTO_ID = 10000;

    private int readerId;
    private ReaderType readerType;

    public Reader() {
        this.readerId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public ReaderType getReaderType() {
        return readerType;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerType=" + readerType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        super.inputInfo();

        System.out.println("Nhập loại bạn đọc: ");
        System.out.println("1. Sinh viên");
        System.out.println("2. Học viên cao học");
        System.out.println("3. Giáo viên");
        System.out.println("Mời chọn: ");

        int typeChoice;

        while (true) {
            typeChoice = new Scanner(System.in).nextInt();
            if (typeChoice >= 1 && typeChoice <= 3) {
                break;
            } else
                System.out.println("Nhập sai, mời nhập lại");
        }

        switch (typeChoice) {
            case 1: {
                this.setReaderType(ReaderType.SINH_VIEN);
                break;
            }
            case 2: {
                this.setReaderType(ReaderType.HOC_VIEN_CAO_HOC);
                break;
            }

            case 3: {
                this.setReaderType(ReaderType.GIAO_VIEN);
                break;
            }
        }
    }
}
