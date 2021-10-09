import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DogDemo {
    public static void main(String[] args) {
        List<Dog> dogs=new ArrayList<>();
                populate(dogs);

        System.out.println("AnyMatch Method :"+anyMatchMethod(dogs));
        System.out.println("allMatch Method :"+allMatchMethod(dogs));
        System.out.println("noneMatch Method :"+noneMatchMethod(dogs));
        findAnyMethod(dogs);
        findAnyMethod2(dogs);


    }

    private static void findAnyMethod2(List<Dog> dogs) {
        Optional<Dog>op=dogs.stream()
                            .filter(d->d.getAge()>5)
                            .findAny();
        op.ifPresent(System.out::println);
    }

    private static void findAnyMethod(List<Dog> dogs) {
        Optional<Dog>op=dogs.stream()
                            .filter(d->d.getWeight()>50)
                            .filter(d->d.getName().startsWith("c"))
                            .findAny();
        op.ifPresent(System.out::println);
    }

    private static boolean noneMatchMethod(List<Dog> dogs) {
        boolean none=dogs.stream().map(d->d.getName()).noneMatch(s->s.equals("red"));
        return none;
    }

    private static boolean allMatchMethod(List<Dog> dogs) {
        boolean isOver=dogs.stream().mapToInt(t->t.getAge()).allMatch(d->d>5);
        return isOver;
    }

    private static boolean anyMatchMethod(List<Dog>dogs) {
        boolean names=dogs.stream()
                          .filter(d->d.getWeight()>50)
                          .anyMatch(d->d.getName().startsWith("c"));
        return names;

    }

    private static List<Dog> populate(List<Dog>dogs) {
        Dog boi=new Dog("boi",30,6);
        Dog clover=new Dog("clover",35,12);
        Dog aiko=new Dog("aiko",50,10);
        Dog zooey=new Dog("zooey",45,8);
        Dog choris=new Dog("choris",45,58);
        dogs.add(boi);
        dogs.add(clover);
        dogs.add(aiko);
        dogs.add(zooey);
        dogs.add(choris);
        return dogs;
    }
}

class Dog{
    String name;
    int age;
    int weight;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
}
