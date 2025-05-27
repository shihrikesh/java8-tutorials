package jdk21;

import java.time.DayOfWeek;

public class EnhancedSwitch {

    public static void main(String[] args) {

        System.out.println(calculateTimeOffClassic(DayOfWeek.FRIDAY));
        System.out.println(calCalculateTimeOff(DayOfWeek.FRIDAY));

    }

    static int calCalculateTimeOff(DayOfWeek dayOfWeek){
        return switch (dayOfWeek){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->  16;
            case SATURDAY, SUNDAY -> 24;
        };
    }

    static int calculateTimeOffClassic(DayOfWeek dayOfWeek) {
        var timeOfWeek = 0;
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                timeOfWeek = 16;
                break;
            }

            case SATURDAY, SUNDAY -> {
                timeOfWeek = 24;
                break;
            }

        }

        return timeOfWeek;
    }
}
