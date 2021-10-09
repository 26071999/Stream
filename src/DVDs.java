import org.w3c.dom.stylesheets.LinkStyle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class DVDInfo{
    String title;
    String genre;
    String leadActors;
    @Override
    public String toString() {
        return "DVDInfo{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", leadActors='" + leadActors + '\'' +
                '}';
    }
    public DVDInfo(String title, String genre, String leadActors) {
        this.title = title;
        this.genre = genre;
        this.leadActors = leadActors;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getLeadActors() {
        return leadActors;
    }
}
public class DVDs {
    public static void main(String[] args) {
        List<DVDInfo>dvds=loadDVDs("C:\\Users\\Lenovo\\Documents\\dvdInfo.txt");
        dvds.forEach(System.out::println);
    }
    private static List<DVDInfo> loadDVDs(String s) {
        List<DVDInfo>dvds=new ArrayList<>();
        try (Stream<String> stream= Files.lines(Paths.get(s))){
            stream.forEach(line->{
                String[]dvdItems=line.split(" ");
                DVDInfo dvd=new DVDInfo(dvdItems[0],dvdItems[1],dvdItems[2]);
                dvds.add(dvd);
            });
        }catch (IOException i){
            System.out.println("Error reading DVD's");
            i.printStackTrace();
        }
        return dvds;
    }
}
