import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Birds {
   static int count=0;
    public static void main(String[] args) {
       Function<String,Integer>b=s1-> {
           for (int i = 0; i < s1.length() - 1; i++) {
               if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                   count=count+1;
               }

           }
           return count;

        };
        Function<String,String>f=(s->s.toLowerCase());
        System.out.println(f.andThen(b).apply("MAninotebooks"));
    }
}
