import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneDisplay{
    public static void main(String[] args){


        //GMT (Greenwich Mean Time)
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        //IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        //PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));


        System.out.println("Current Time in Different Time Zones:");
        System.out.println("GMT : " + gmtTime);
        System.out.println("IST : " + istTime);
        System.out.println("PST : " + pstTime);
    }
}
