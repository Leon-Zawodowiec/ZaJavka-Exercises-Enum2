package package8.enums;

import java.util.Arrays;

public class ExercisesEnum2 {
    private static void exerciseEnum2() {
        for (Dance dance : Dance.values()) {
            System.out.println(dance + " | possible hours: "
                    + dance.getHours() + " | days: "
                    + dance.getDays() + " | alternative: "
                    + dance.getAlternative());
        }
    }
    public static void main(String[] args) {
        exerciseEnum2();
    }
}



