import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Range {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum=nums.stream().mapToInt(n->n).sum();
        System.out.println("Sum is :"+sum);

        int sum1=nums.stream().parallel().mapToInt(n->n).sum();
        System.out.println("Sum using parallel :"+sum1);
        Stream<String> iterate = Stream.iterate("Help", s -> s.concat("Me")).limit(5);
        iterate.forEach(System.out::println);

    }
}
