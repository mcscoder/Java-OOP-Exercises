package mydate;
public class MyDate {
    private int year, month, day;
    private int curMonth, curDay;

    public static final String[]strMonth = {"Jan", "Jan", "Feb", "Mar", "Apr", "May", "Jun"
                                            ,"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static final String[] strDay = {"Sunday", "Monday", "Tuesday", 
                                            "Wednesday" ,"Thursday", "Friday", "Saturday"};

    public static final int[] dayInMonth = {31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int numberDayOfMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) // feb has 29 days in a leap-year
            return dayInMonth[month] + 1; // return 28 + 1
        return dayInMonth[month];
    }

    public static boolean isValidDate(int year, int month, int day) {
        return 
        (
            0 < year && year < 10000 && // year range [1, 9999]
            0 < month && month < 13 && // month range [1, 12]
            0 < day && day <= numberDayOfMonth(year, month) // day range [1, numberDayOfMonth]
        );
    }

    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day) == false) {
            throw new ArithmeticException("Invalid year, month, or day");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private MyDate() {}

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day) == false) {
            System.out.println("Invalid year, month, or day");
            return;
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (isValidDate(year, month, day) == false) {
            System.out.println("Invalid year");
            return;
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (isValidDate(year, month, day) == false) {
            System.out.println("Invalid month");
            return;
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (isValidDate(year, month, day) == false) {
            System.out.println("Invalid day");
            return;
        }
        this.day = day;
    }

    public String getDayOfWeek(int year, int month, int day) {
        if (isValidDate(year, month, day) == false)
            return "Invalid year, month, or day";

        // https://www.hackerearth.com/blog/developers/how-to-find-the-day-of-a-week/
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) year -= 1;
        return strDay[(year + year/4 - year/100 + year/400 + t[month - 1] + day) % 7];
    }

    public String toString() {
        if (isValidDate(year, month, day) == false)
            return "Invalid year, month, or day";
            
        return String.format("%s %s %s %s", 
            getDayOfWeek(year, month, day), day, strMonth[month], year);
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day += 1;
            return this;
        }
        curDay = day;
        day = 1;
        return nextMonth();
    }

    public MyDate nextMonth() {
        if (isValidDate(year, month + 1, day)) {
            month += 1;
            return this;
        }
        
        curMonth = month;
        month = 1;
        return nextYear();
    }

    public MyDate nextYear() {
        if (isValidDate(year + 1, month, day)) {
            year += 1;
            return this;
        }
        day = curDay;
        month = curMonth;
        return new MyDate();
    }

    public MyDate previousDay() {
        if (isValidDate(year, month, day - 1)) {
            setDay(day - 1);
            return this;
        }
        curDay = day;
        day = numberDayOfMonth(year, month - 1);
        return previousMonth();
    }

    public MyDate previousMonth() {
        if (isValidDate(year, month - 1, day)) {
            setMonth(month - 1);
            return this;
        }

        if (month == 2) {
            month -= 1;
            day = numberDayOfMonth(year, month);
            return this;
        }

        // exception 31th day in months with only 30 days
        if (day == 31 && month != 1) {
            month -= 1;
            day = numberDayOfMonth(year, month);
            return this;
        }
        
        month = 12;
        return previousYear();
    }

    public MyDate previousYear() {
        if (isValidDate(year - 1, month, day)) {
            setYear(year - 1);
            return this;
        }
        
        // exception February 29th in non-leap year
        if (month == 2) {
            year -= 1;
            day = numberDayOfMonth(year, month);
            return this;
        }

        day = curDay;
        month = curMonth;
        return new MyDate();
    }
}

