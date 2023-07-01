package entity;

public class TimesheetDetail {
    private Factory factory = new Factory();
    private int day;

    public TimesheetDetail(Factory factory, int day) {
        this.factory = factory;
        this.day = day;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "TimesheetDetail{" +
                "factory=" + factory +
                ", day=" + day +
                '}';
    }
}
