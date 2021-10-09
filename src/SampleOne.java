interface J{
    default void m1(){
        System.out.println("hello");
    }
}
interface K{
    default void m1(){
        System.out.println("HI hello");
    }

}

public class SampleOne implements J,K {
    public static void main(String[] args)throws Exception {
        Class.forName("Sample").newInstance();
    }

    @Override
    public void m1() {
        J.super.m1();
    }
}
