package package8.enums;

import java.util.Arrays;

public enum Dance {
    CHACHACHA(new String[]{"10:00", "13:00", "15:30"}, new Day[]{Day.MONDAY, Day.FRIDAY}){
        @Override
        public Dance getAlternative () {
        return TANGO;
        }
    },

    TANGO(new String[] {"12:00", "14:00", "17:30"},new Day[]{Day.WEDNESDAY, Day.SUNDAY}){
        @Override
        public Dance getAlternative () {
        return JIVE;
        }
    },

    JIVE(new String[] {"14:00", "17:00", "18:30"},new Day[]{Day.SATURDAY, Day.TUESDAY}){
        @Override
        public Dance getAlternative () {
        return RUMBA;
        }
    },

    RUMBA(new String[] {"16:00", "13:00", "15:30"},new Day[]{Day.MONDAY, Day.SUNDAY}){
        @Override
        public Dance getAlternative () {
        return FOXTROT;
        }
    },

    FOXTROT(new String[] {"18:00", "13:30", "15:30"},new Day[]{Day.FRIDAY, Day.WEDNESDAY}){
        @Override
        public Dance getAlternative () {
        return SAMBA;
        }
    },

    SAMBA(new String[] {"8:00", "12:00", "15:30"},new Day[]{Day.THURSDAY, Day.FRIDAY}){
        @Override
        public Dance getAlternative () {
        return CHACHACHA;
        }
    };

    private final String[] hours;
    private final Day[] days;

    Dance(String[] hours, Day[] days) {
        this.hours = hours;
        this.days = days;
    }

    public String getHours() {
        String getHours = Arrays.toString(hours).replace("]", "");
        return getHours.replace("[","");
    }

    public String getDays() {
        String getDays = Arrays.toString(days).replace("]","");
        return getDays.replace("[","");
    }
    public abstract Dance getAlternative();
}
