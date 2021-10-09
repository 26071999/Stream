import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sensor {
    String value="up";
    int i=0;
    public Sensor(){

    }
    public String next(){
        i=i+1;
        return i>12? "down":"up";
    }

    public static void main(String[] args) {
        Sensor s=new Sensor();
        Stream<String>stream=Stream.generate(()->s.next());
        Optional<String>op=stream.filter(v->v.equals("down"))
                                    .findFirst();
        op.ifPresent(System.out::println);

    }
}
