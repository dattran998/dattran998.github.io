public class Card {
    private String id;
    private String dayBorrow;
    private String dayPayment;
    private String bookID;
    private Student student;

    public Card(String id, String dayBorrow, String dayPayment, String bookID, Student student) {
        this.id = id;
        this.dayBorrow = dayBorrow;
        this.dayPayment = dayPayment;
        this.bookID = bookID;
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDayBorrow() {
        return dayBorrow;
    }

    public void setDayBorrow(String dayBorrow) {
        this.dayBorrow = dayBorrow;
    }

    public String getDayPayment() {
        return dayPayment;
    }

    public void setDayPayment(String dayPayment) {
        this.dayPayment = dayPayment;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", dayBorrow='" + dayBorrow + '\'' +
                ", dayPayment='" + dayPayment + '\'' +
                ", bookID='" + bookID + '\'' +
                ", student=" + student.toString() +
                '}';
    }
}

