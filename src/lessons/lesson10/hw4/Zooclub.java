package lessons.lesson10.hw4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zooclub {

    private Map<Person, List<Pet>> club = new HashMap<>();

    public Zooclub() {
    }

    public Zooclub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }


    @Override
    public String toString() {
        return "Zooclub{" +
                "club=" + club +
                '}';
    }
}
