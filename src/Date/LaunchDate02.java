package Date;

import java.time.*;

/**
 * LocalDate
 * LocalTime
 * LocalDateTime
 *
 * these are introduced in Java's Time package
 */
public class LaunchDate02 {
    static void main() {
        // it will give current time of the system
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int dayOfMonth = date.getDayOfMonth();
        System.out.println("Day of the month :: " + dayOfMonth);

        int dayOfYear = date.getDayOfYear();
        System.out.println("Day of the year :: " + dayOfYear);

        int month =  date.getMonthValue();
        System.out.println("Month :: " + month);
        System.out.println(dayOfMonth + "/" + month + "/" + date.getYear());

        LocalDate dob = LocalDate.of(1994, 3, 8);
        System.out.println("Date of birth :: " + dob);

        LocalTime time = LocalTime.now();
        System.out.println("Time :: " + time);
        int hour = time.getHour();
        int minute = time.getMinute();
        int seconds =  time.getSecond();
        int nano =  time.getNano();
        System.out.println("Hour :: " + hour +  " Minute :: " + minute + " Second :: " + seconds + " Nano :: " + nano);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date Time :: " + dateTime);

        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime dt =  dateTime.atZone(zoneId);
        System.out.println("Zone Date Time :: " + dt);
    }
}
