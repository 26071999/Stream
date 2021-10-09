public class ConstructorRef {
    public static void main(String[] args) {
       /* Interf i=(s,i1)->{
            User1 u=new User1();
            return u;
        };*/
        Interf i1=User1::new;
        //System.out.println(i.createUser());
        System.out.println(i1.createUser("Prakash",12));
    }
}
interface Interf{
    public User1 createUser(String name,int id);
}
class User1{
    String name;
    int id;
    User1(){
        System.out.println("No-Arg constructor called");
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public User1(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return "name:  "+getName()+" id: "+getId();
    }
}
