package date;
// Done
public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if (1 > day || day > 31 ||
            1 > month || month > 12 ||
            1900 > year || year > 9999) {
                throw new ArithmeticException("No input validation needed");
            }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        // format date leading by zero
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
