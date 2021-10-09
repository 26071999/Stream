import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Temperature {
    String location;
    Double temp;

    public Temperature(String location, Double temp) {
        this.location = location;
        this.temp = temp;
    }

    public String getLocation() {
        return location;
    }

    public Double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "location='" + location + '\'' +
                ", temp=" + temp +
                '}';
    }

    public static void main(String[] args) {
        List<Temperature>temperatures= Arrays.asList(new Temperature("India",104.78),
                                                    new Temperature("USA",87.56),
                                                            new Temperature("UK",96.32),
                                                    new Temperature("Canada",89.12));
        Comparator<Temperature>comparator=(t1,t2)->t1.getTemp().compareTo(t2.getTemp());
        Optional<Temperature> max = temperatures.stream().max(comparator);
        temperatures.stream().sorted(Comparator.comparing(t->t.getTemp())).forEach(System.out::println);
    }
}
