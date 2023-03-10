package Ex6_Enums;


public enum Days {
    MONDAY (false),
    TUESDAY (false),
    WEDNESDAY(false),
    THURSDAY (false),
    FRIDAY (false),
    SATURDAY (true),
    SUNDAY (true);

    public boolean isWeekEnd;

    Days(boolean isWeekEnd) {
        this.isWeekEnd = isWeekEnd;
    }

    public boolean isWeekEnd() {
        return isWeekEnd;
    }
}
