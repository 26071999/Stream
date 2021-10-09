import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NewSample {
    public static void main(String[] args) {
        Map<Integer,Manager>map=new HashMap<>();
        map.put(10,new Manager("Prakash","TamilNadu",63));
        map.put(11,new Manager("Maani","Kerala",64));
        map.put(12,new Manager("Hari","Andra",65));
        map.put(13,new Manager("Siva","Delhi",66));
     //map.entrySet().stream().collect(Collectors.groupingBy(Manager::getId, Collectors.mapping(Manager::getName)),Collectors.toList());

    }

}
class Manager{
    private String name;
    private String address;
    private int id;

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    public Manager(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }
}