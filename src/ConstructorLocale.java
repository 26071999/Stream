import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class ConstructorLocale {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Prakash");
        list.add("Grija");
        Stream<String> stream=list.stream();
        list.add("Papa");
        stream.forEach(System.out::println);

       /* BiFunction<String,String, Locale>bf=(lang,name)->{
            Locale l=new Locale(lang,name);
            return l;
        };
        Function<String,Locale> bf1=Locale::new;
        System.out.println(bf1.apply("ja"));
        Locale locale=bf.apply("en","US");
        System.out.println(locale);*/


     /*   Map<String,String> mapEnv=System.getenv();
        BiConsumer<String,String>bc=(key,value)-> System.out.println(key+" = "+value);
        mapEnv.forEach(bc);*/
    }
}
@FunctionalInterface
interface  I{
    boolean equals(Object i);
    String pick();
}