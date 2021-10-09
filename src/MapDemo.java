import java.io.File;
import java.io.OptionalDataException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {

    public static void main(String[] args)throws Exception {
       /* Map<String,String> todos=new HashMap<>();
        todos.put("monday","wash dog");
        todos.put("tuesday","weed yard");
       // Consumer<Map>printToDo=(Map m)-> System.out.println("On "+m.keySet()+"do "+m.values());
        BiConsumer<String,String>printToDo=(String k,String v)-> System.out.println("On "+k+" do "+v);
        todos.forEach(printToDo);*/

       /* Integer[]i={1,2,3};
        Stream<Integer> stream = Arrays.stream(i);
        long numElements=stream.filter(i1->i1>2).count();
        System.out.println("No of Elements "+numElements);

        numElements=Arrays.stream(i).filter(i2->i2>1).count();
        System.out.println("No of elements "+numElements);*/

       /* List<Double>doubles=Arrays.asList(102.23,202.01,101.09,23.32,34.89,105.78);

        long count=doubles.stream().sorted().distinct().limit(3).count();
        System.out.println(count);
*/
        /*Stream<String>stream= Files.lines(Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\SpringBootApi\\ArrayReverse\\src\\Mapping.java"));
        stream.forEach(s-> System.out.println(s));*/

      /*  List<String>names=Arrays.asList("prakash","mani","Harihar","Hari","deva");
        names.stream().filter(s->s.startsWith("p")||s.startsWith("H")).filter(s->s.length()>4).forEach(System.out::println);
*/
        /*int i[]={1,2,3,4,5,6};
        long result= Arrays.stream(i).peek(n-> System.out.println("Number is: "+n+",")).map(n->n*n).filter(n->n>20).peek(n-> System.out.println("Square is: "+n+",")).count();
        System.out.println(result);
        */
       /* List<Double>doubleList=Arrays.asList(121.2,102.21,103.89,203.23,56.89,105.78);
        OptionalDouble sum=doubleList.stream().mapToDouble(r->r).reduce((i1,i2)->i1+i2);
        if(sum.isPresent()) {
            System.out.println("Sum of all readings " + sum.getAsDouble());

        }

        List<Double>d=Arrays.asList();

        DoubleStream ds=d.stream().mapToDouble(m->m);
        Stream<Double> doubleStream =Stream.of(1.0,2.0,3.0,4.0);
        Optional<Double> first = doubleStream.findFirst();
           first.ifPresent(n-> System.out.println(n));*/


       /* String []s={"Mukesh",null,"Deva","Hari"};
        Optional<String[]>op=Optional.ofNullable(s);
       op.orElse("Prakash","Hello"));*/
    }
}
