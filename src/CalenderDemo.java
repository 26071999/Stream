import sun.util.resources.cldr.tig.CalendarData_tig_ER;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class CalenderDemo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your year");
        int yy=scan.nextInt();
        Year year=Year.of(yy);
        if(year.isLeap()){
            System.out.println(yy+" This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }
        //getLocalDate();

        //getLocalTimeInfo();

       // getLocalDateTimeInfo();

        /*LocalDate date=LocalDate.of(2021,Month.JANUARY,12);
        System.out.println(date);
        LocalDate d=date.plus(12, ChronoUnit.YEARS);
        System.out.println(d);*/



    }

    private static void getLocalDateTimeInfo() {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        int dd=ldt.getDayOfMonth();
        int mm=ldt.getMonthValue();
        int yy=ldt.getYear();
        System.out.printf("%d-%d-%d",dd,mm,yy);
        int hours=ldt.getHour();
        int min=ldt.getMinute();
        int sec=ldt.getSecond();
        int nano=ldt.getNano();
        System.out.printf("%d-%d-%d:%d",hours,min,sec,nano);
    }

    private static void getLocalTimeInfo() {
        LocalTime t=LocalTime.now();
        System.out.println(t);
        int h=t.getHour();
        int m=t.getMinute();
        int s=t.getSecond();
        int n=t.getNano();
        System.out.printf("%d-%d-%d:%d",h,m,s,n);
    }

    private static void getLocalDate() {
        Calendar cal=Calendar.getInstance();
        Clock c=Clock.systemDefaultZone();
        LocalDate date=LocalDate.now(c);
        System.out.println(date);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        ZoneId id=ZoneId.of("Asia/Aqtau");
        LocalDate d=LocalDate.now(id);
        System.out.println(d);
    }
}
