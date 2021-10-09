import java.util.function.Supplier;

public class UserMethods {
    public static void main(String[] args) {
        Supplier<User> s=()->{
            User u=new User("Prakash",20);
            return u;
        };
        System.out.println(s.get());
        Supplier<User> s1=UserMethods::createUser;
        System.out.println(s1.get());
    }
    public static User createUser(){
        User u=new User("Mani",31);
        return u;
    }
}
class User{
    String name;
    int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Name :"+getName()+",  "+" Id: "+getId();
    }
}
