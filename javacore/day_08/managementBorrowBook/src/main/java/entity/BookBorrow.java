package entity;

public class BookBorrow {
    private Reader reader = new Reader();
    private Book[] books = new Book[100];

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}