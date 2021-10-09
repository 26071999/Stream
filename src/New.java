import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class New {
    public static void main(String[] args) {
      /*  System.out.format("Total compute tax  "+computeTax(10.00,i->i*0.05));

    }*/
   /* public double computeTax(double price, Function<Double>op){
        return op.apply(price);
    }*/
   /* public static double computeTax(double price, UnaryOperator<Double>op){
        return op.apply(price)+price;
    }*/
        int []i={1,2,3,4,5,6};

        System.out.println("Count :"+Arrays.stream(i,2,5).count());
        Arrays.stream(i,1,6).forEach(i1-> System.out.print(i1+" "));
        List<String> list=Arrays.asList("Prakash","Grija");
        list.stream().filter(s->s.startsWith("P")).map(String::toLowerCase).forEach(System.out::println);
    }
}
