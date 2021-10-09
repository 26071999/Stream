import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

interface I12{
    void get();
}
public class MoreSheep implements I12 {
    static boolean b=false;
    public static void main(String[] args) {

        int x=10;
        MoreSheep m=new MoreSheep();
        I12 i=m::m1;
        m.go(s->b==false);
        m.go(s->adder(2,7)>=12);
        m.go(s->b=true);
        m.go(s->x>12);
    }
    void m1(){
        System.out.println("hello");
    }
    void go(Predicate<MoreSheep>p){
        MoreSheep m1=new MoreSheep();
        if(p.test(m1)){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

    private static int adder(int i, int i1) {
        return i+i1;
    }


    @Override
    public void get() {

    }
}
