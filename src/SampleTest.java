import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class SampleTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Prakash", "Mani", "Siva", "Deva", "Renga");
        //UnaryOperator<String> u = s -> s.toUpperCase();
        UnaryOperator<String> u1=String::toLowerCase;
        for (String name : list) {
            System.out.println(u1.apply(name));
        }
    }
}
