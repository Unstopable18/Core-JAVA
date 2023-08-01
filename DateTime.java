import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateTime {
    public static void main(String[] args) {

        LocalDate myDateObj=LocalDate.now();
        System.out.println("Date -> "+myDateObj);

        LocalDateTime myDateTimeObj=LocalDateTime.now();
        System.out.println("DateTime -> "+myDateTimeObj);

        LocalTime myTimeObj=LocalTime.now();
        System.out.println("Time -> "+myTimeObj);

        // DateTimeFormatter myDateTimeFormatterObj=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:nn");
        DateTimeFormatter myDateTimeFormatterObj=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm");
        String formattedDateTime=myDateTimeObj.format(myDateTimeFormatterObj);
        System.out.println("DateTimeFormatter -> "+formattedDateTime);

    }
}
