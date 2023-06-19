package entity;

import statics.Specialization;

import java.util.Scanner;

public class Book {
    public static int AUTO_ID = 10000;

    private int bookId;
    private String bookName;
    private String author;
    private Specialization specialization;
    private int year;

    public Book() {
        this.bookId = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", specialization=" + specialization +
                ", year=" + year +
                '}';
    }

    public void inputInfo() {
        System.out.println("Nhập tên sách: ");
        this.setBookName(new Scanner(System.in).nextLine());
        System.out.println("Nhập tên tác giả: ");
        this.setAuthor(new Scanner(System.in).nextLine());
        System.out.println("Nhập chuyên ngành: ");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học nghệ thuật");
        System.out.println("3. Điện tử viễn thông");
        System.out.println("4. Công nghệ thông tin");
        System.out.println("Chọn chuyên ngành: ");
        int typeSpecialization;

        while (true) {
            typeSpecialization = new Scanner(System.in).nextInt();
            if (typeSpecialization >= 1 && typeSpecialization <= 4) {
                break;
            } else
                System.out.println("Nhập sai, mời nhập lại");
        }

        switch (typeSpecialization) {
            case 1: {
                this.setSpecialization(Specialization.KHOA_HOC_TU_NHIEN);
                break;
            }

            case 2: {
                this.setSpecialization(Specialization.VAN_HOC_NGHE_THUAT);
                break;
            }

            case 3: {
                this.setSpecialization(Specialization.DIEN_TU_VIEN_THONG);
                break;
            }

            case 4: {
                this.setSpecialization(Specialization.CONG_NGHE_THONG_TIN);
                break;
            }
        }

        System.out.println("Nhập năm xuất bản: ");
        this.setYear(new Scanner(System.in).nextInt());
    }
}