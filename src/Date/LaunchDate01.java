package Date;

import java.util.Date;

public class LaunchDate01 {
    static void main() {
        // Date class of util package will return both date and time
        Date date = new Date();
        IO.println(date);

        // time in milliseconds
        long timeInMs = date.getTime();
        IO.println(timeInMs);

        // returns only date
        java.sql.Date date2 = new java.sql.Date(timeInMs);
        IO.println(date2);
    }
}
