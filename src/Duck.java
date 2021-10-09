import javax.swing.text.StyledEditorKit;
import java.util.*;
import java.util.stream.Collectors;

public class Duck {
    String color;
    String name;
    int age;
    public String toString() {
        return getName()+" "+getAge();
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Duck(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new Duck("yellow", "Prakash", 21),
                new Duck("white", "Hari", 20),
                new Duck("yellow", "Siva", 23),
                new Duck("blue", "Prakash", 25),
                new Duck("green", "Deva", 20),
                new Duck("green", "Pradosh", 19),
                new Duck("blue", "Praveen", 29));
        Comparator<Duck>byName=Comparator.comparing(Duck::getName);
        Comparator<Duck>byAge=Comparator.comparing(Duck::getAge);
        Comparator<Duck>byColour=Comparator.comparing(Duck::getColor);
        ducks.stream().sorted(byName.thenComparing(byAge)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
