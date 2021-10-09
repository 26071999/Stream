import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonsMethod {
    public static void main(String[] args) {
        List<Person> persons = PersonsFactory.createPersons();
        persons.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList()).forEach(System.out::println);
        persons.stream().filter(p->p.getAge()>20).collect(Collectors.toCollection(HashSet::new)).forEach(System.out::println);
        Map<String,Double> collect1 = persons.stream().collect(Collectors.groupingBy(Person::getName,Collectors.averagingDouble(Person::getAge)));
        Map<Boolean, Long> collect = persons.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 20,Collectors.counting()));
        System.out.println(collect1);
        System.out.println(collect);
    }
}
class PersonsFactory{
    public static List<Person> createPersons(){
        return Arrays.asList(new Person("Prakash","India",22),
                              new Person("Mani","USA",20),
                             new Person("Siva","UK",22),
                             new Person("Deva","SriLanka",23),new Person("Siva","Canada",23));
    }
}
class Person{
    private String name;
    private String country;
    private int age;
    Person(){

    }
    public Person(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public Person(Person person) {
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return getName()+" is coming from "+getCountry()+" his age is "+getAge();
    }
    public static Person print(Person p){
      return p;
    }
}