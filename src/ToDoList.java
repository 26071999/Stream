import java.util.*;
import java.util.function.Predicate;

public class ToDoList {
    public static void main(String[] args) {
        Map<String,String>todos=new HashMap<>();
        todos.put("monday","wash dog");
        todos.put("monday","weed yard");
        Set<Map.Entry<String, String>> entries = todos.entrySet();
        entries.forEach(System.out::println);

        ToDoList toDoList=new ToDoList();
        //toDoList.checkList(todos,k->k.equals("tuesday"));
        List<String> list=new ArrayList<>(Arrays.asList("Prakash"));
        System.out.println(list.size());

    }
   /* public void checkList(Map<String,String>todos, Predicate<String>isDay){
        todos.forEach((d,t)->{
            if(isDay.test(d)){
                System.out.println("You should really to the "+t);
            }
        });
    }*/
}
