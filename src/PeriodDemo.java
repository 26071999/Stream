import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PeriodDemo {
    public static void main(String[] args) {
        //getLivingdays();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d-MMM-yyyy");
        System.out.println(LocalDate.parse("23-Jan-2021",formatter));

    }

    private static void getLivingdays() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birthYear");
        int year=scan.nextInt();
        System.out.println("Enter your birthMonth");
        int month=scan.nextInt();
        System.out.println("Enter your birthDate");
        int day=scan.nextInt();
        LocalDate date=LocalDate.of(year,month,day);
        LocalDate livingDate=date.plus(80, ChronoUnit.YEARS);
        Period period=Period.between(date,livingDate);
        int days=period.getDays()+(period.getMonths()*12*30)+(period.getYears()*365);

        LocalDate nowDate=LocalDate.now();
        Period period1=Period.between(date,nowDate);
        int days1=period1.getDays()+(period1.getMonths()*12*30)+(period1.getYears()*365);
        System.out.println((days-days1)/365);
    }
}
