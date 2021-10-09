import java.util.*;

public class HelpDemo {
    public static void main(String[] args) {
        List<Integer>integers=Arrays.asList(10,8,36,40,-12,78,24,67,56,26,19,37,7,-1);
        Collections.sort(integers);
        System.out.println("Defalut : "+integers);
        Collections.sort(integers,(i1,i2)   ->i2-i1);
        System.out.println("Customized: "+integers);
       /* System.out.println(integers.stream().filter(i->i>20).mapToInt(i->i*i).average().getAsDouble());
        int j=integers.stream().filter(i->i>20).mapToInt(i->i*i).reduce(0,(i1,i2)->(i1+i2)/2);
        System.out.println(j);*/
    }
}
