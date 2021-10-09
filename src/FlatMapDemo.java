import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Students>students= Arrays.asList(new Students("Prakash",21,"India",Arrays.asList(10,20,30,40,50)),
                                                new Students("hari",20,"UK",Arrays.asList(21,31,41)),
                                                new Students("Mani",22,"USA",Arrays.asList(100,200,300,500)));

        List<Integer> collect = students.stream().map(s -> s.getMobileNumbers()).flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.contains(100));
        System.out.println(collect.size());

    }
}

class Students{
    private String name;
    private int age;
    private String country;
    private List<Integer> mobileNumbers;

    public Students(String name, int age, String country, List<Integer> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public List<Integer> getMobileNumbers() {
        return mobileNumbers;
    }
}
