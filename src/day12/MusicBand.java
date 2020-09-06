package day12;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<String> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        members = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String fio) {
        members.add(fio);
    }

    public void removeMember(String fio) {
        members.removeIf(elem -> elem.equals(fio));
    }

    public void moveMembersTo(MusicBand destination) {
        if (this == destination) return;
        for (String fio : this.members) destination.addMember(fio);
        this.members = new ArrayList<>();
    }
}
