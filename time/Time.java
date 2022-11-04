package time;
// Done
public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second) == false)
            throw new ArithmeticException("No input validation needed");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private static boolean isValidTime(int hour, int minute, int second) {
        return (0 <= hour   && hour   <= 23 &&
                0 <= minute && minute <= 59 &&
                0 <= second && second <= 59);
    }
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time nextSecond() {
        if (isValidTime(hour, minute, second + 1)) {
            second += 1;
            return this;
        }
        second = 0;
        return nextMinute();
    }

    private Time nextMinute() {
        if (isValidTime(hour, minute + 1, second)) {
            minute += 1;
            return this;
        }
        minute = 0;
        return nextHour();
    }

    private Time nextHour() {
        if (isValidTime(hour + 1, minute, second)) {
            hour += 1;
            return this;
        }
        hour = 0;
        return this;
    }

    public Time previousSecond() {
        if (isValidTime(hour, minute, second - 1)) {
            second -= 1;
            return this;
        }
        second = 59;
        return previousMinute();
    }

    private Time previousMinute() {
        if (isValidTime(hour, minute - 1, second)) {
            minute -= 1;
            return this;
        }
        minute = 59;
        return previousHour();
    }

    private Time previousHour() {
        if (isValidTime(hour - 1, minute, second)) {
            hour -= 1;
            return this;
        }
        hour = 23;
        return this;
    }
}
