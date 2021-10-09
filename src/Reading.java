import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Reading {
    int year;
    int month;
    int day;
    Double value;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Double getValue() {
        return value;
    }

    public Reading(int year, int month, int day, Double value) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.value = value;
    }

    public static void main(String[] args) {
        List<Reading>readings= Arrays.asList(new Reading(2017,1,12,106.58),
                                                new Reading(2018,12,2,107.8),
                                            new Reading(1999,7,26,106.34),
                                            new Reading(2019,8,23,106.12));
        double avg=readings.stream().mapToDouble(Reading::getValue).filter(r->r>106).reduce(0,(i1,i2)->(i1+i2)/2);
        System.out.println(avg);
    }
}
