import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Associate[] associates = new Associate[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 5;i++) {
            associates[i] = new Associate(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        }
        String searchTechnology = sc.next();
        sc.close();
        Associate[] result= associatesForGivenTechnology(associates,searchTechnology);
        for(int i=0;i<result.length;i++)
            System.out.println(result[i].getId());
    }

    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        Associate[] refined = new Associate[0];

        List<Associate> list= Arrays.stream(associates).filter(a->a.getTechnology().equals(searchTechnology) && a.getExperienceInYears()%5==0).collect(Collectors.toList());
        refined=list.toArray(refined);

        return refined;
    }
}

class Associate{
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTechnology() {
        return technology;
    }
    public void setTech(String technology) {
        this.technology = technology;
    }
    public int getExperienceInYears() {
        return experienceInYears;
    }
    public void setExp(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }
}
