package package8.enums;

public enum Day implements WorkingDay {
    MONDAY("MON", true, false),
    TUESDAY("TUE", true, false),
    WEDNESDAY("WED", true, false),
    THURSDAY("THU", true, false),
    FRIDAY("FRI", true, false),
    SATURDAY("SAT", false, true),
    SUNDAY("SUN", false, true);


    private final String shortName;
    private final boolean isWorkingDay;
    private final boolean isWeekend;

    Day(String shortName, boolean isWorkingDay, boolean isWeekend) {
        this.shortName = shortName;
        this.isWorkingDay = isWorkingDay;
        this.isWeekend = isWeekend;
    }

    public String getShortName() {
        return shortName;
    }

    @Override
    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    @Override
    public boolean isWeekend() {
        return isWeekend;
    }
}


