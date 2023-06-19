package main;

import entity.Book;
import entity.BookBorrow;
import entity.Reader;
import statics.ReaderType;
import statics.Specialization;

import java.util.Scanner;

public class main {

    private static Reader[] readers = new Reader[100];
    private static Book[] books = new Book[100];
    private static BookBorrow[] bookBorrows = new BookBorrow[100];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            showMenuContent();
            int choice = funtionChoice();

            switch (choice) {

                case 1: {
                    inputNewBook();
                    break;
                }
                case 2: {
                    showBook();
                    break;
                }
                case 3: {
                    inputNewReader();
                    break;
                }
                case 4: {
                    showReader();
                    break;
                }
                case 5: {

                    int flag = 0;
                    for (int m = 0; m < readers.length; m++) {
                        if (readers[m] != null)
                            flag = m;
                        break;
                    }

                    for (int i = 0; i <= flag; i++) {

                        if (i < bookBorrows.length && i < readers.length && bookBorrows[i] != null && readers[i] != null) {
                            bookBorrows[i].setReader(readers[i]);
                        }

                        System.out.println("Chọn sách mà người đọc thứ" + (i + 1) + " mượn");
                        showBook();
                        int index = 0;
                        Book[] newBook = new Book[100];

                        while (true) {
                            System.out.println("1. Chọn sách");
                            System.out.println("2. Thoát chọn");
                            int choiceOption;
                            while (true) {
                                choiceOption = new Scanner(System.in).nextInt();
                                if (choiceOption >= 1 && choiceOption <= 2) {
                                    break;
                                } else
                                    System.out.println("Nhập sai, mời nhập lại");
                            }

                            switch (choiceOption) {
                                case 1: {
                                    int sc = new Scanner(System.in).nextInt();
                                    System.out.println("Chọn sách thứ: " + sc);

                                    for (int k = index; k < newBook.length; k++) {

                                        newBook[k] = books[sc-1];
                                        index++;
                                        break;
                                    }

                                    if (i < bookBorrows.length && newBook != null) {
                                        bookBorrows[i].setBooks(newBook);
                                    }
                                    break;
                                }

                                case 2: {

                                    return;
                                }
                            }
                        }


                    }
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    break;
                }
            }

        }
    }

    private static void inputNewBook() {
        System.out.println("Bạn muốn thêm bao nhiêu đầu sách mới: ");
        int numberBook = new Scanner(System.in).nextInt();

        for (int i = 0; i < numberBook; i++) {
            System.out.println("Nhập thông tin đầu sách thứ " + (i + 1));
            Book book = new Book();
            book.inputInfo();

            saveBook(book);
        }
    }

    private static void saveBook(Book book) {
        for (int j = 0; j < books.length; j++) {
            if (books[j] == null) {
                books[j] = book;
                break;
            }
        }
    }

    private static void showBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    private static void inputNewReader() {
        System.out.println("Bạn muốn thêm mới bao nhiêu bạn đọc: ");
        int readerNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < readerNumber; i++) {
            Reader reader = new Reader();
            System.out.println("Nhập thông tin của bạn đọc thứ " + (i + 1));
            reader.inputInfo();

            saveReader(reader);

        }
    }

    private static void saveReader(Reader reader) {
        for (int j = 0; j < readers.length; j++) {
            if (readers[j] == null) {
                readers[j] = reader;
                break;
            }
        }
    }

    private static int funtionChoice() {
        int choice;
        while (true) {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            } else
                System.out.println("Nhập sai, mời nhập lại");
        }
        return choice;
    }

    private static void showMenuContent() {
        System.out.println("============CHƯƠNG TRÌNH QUẢN LÝ MƯỢN SÁCH==========");
        System.out.println("1. Nhập danh sách đầu sách mới");
        System.out.println("2.In ra danh sách đầu sách đã có");
        System.out.println("3. Nhập danh sách bạn đọc mới");
        System.out.println("4. In ra danh sách bạn đọc đã có");
        System.out.println("5. Lập bảng quản lý mượn sách");
        System.out.println(" 6. In danh sách ra màn hình");
        System.out.println("7. Săp xếp bảng quản lý mượn sách");
        System.out.println("8. Tìm kiếm hiển thị danh sách mượn sách theo tên bạn đọc");
        System.out.println("9. Thoát");

        System.out.println("Chọn: ");
    }

    public static void showReader() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.println(readers[i].toString());
            }
        }
    }
}
