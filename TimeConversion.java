package Date_and_time_API;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) {
        String time12Hour = "12:00:00 PM"; // Change this to your desired input time
        
        // Parse the input time in 12-hour format
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime localTime = LocalTime.parse(time12Hour, inputFormatter);
        
        // Format the time in 24-hour format
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String militaryTime = localTime.format(outputFormatter);
        
        System.out.println("12-hour Time: " + time12Hour);
        System.out.println("Military Time: " + militaryTime);
    }
}