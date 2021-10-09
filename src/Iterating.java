import java.util.stream.Stream;

public class Iterating {
    public static void main(String[] args) {
        Stream.iterate(0,s->s+1).limit(10).filter(i->i>5).forEach(System.out::println);
    }
}
