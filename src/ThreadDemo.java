public class ThreadDemo {
    public static void main(String[] args) {
       Runnable r=ThreadDemo::m2;
       Thread t=new Thread(r);
       t.start();
       for(int i=0;i<5;i++){
           System.out.println("Main Thread");
       }
    }
    public static void m2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
