import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        Student[]stds={new Student("Prakash",63),new Student("Hari",100),new Student("Deva",101),new Student("Manoj",103)};
        Arrays.stream(stds).sorted((d1,d2)->(d1.id-d2.id)).forEach(System.out::println);
    }
}
class Student {
    String name;
    Integer id;
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
