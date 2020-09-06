package day12;

import java.util.ArrayList;
import java.util.List;

class MusicArtist {
    protected String name;
    protected int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MusicBandExt {
    private final String name;
    private final int year;
    private List<MusicArtist> members;

    public MusicBandExt(String name, int year) {
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(String fio, int age) {
        members.add(new MusicArtist(fio, age));
    }

    public void addMember(MusicArtist artist){
        members.add(artist);
    }

    public void removeMember(MusicArtist artist) {
        members.removeIf(elem -> elem == artist);
    }

    public void moveMembersTo(MusicBandExt destination) {
        if (this == destination) return;
        for (MusicArtist artist : this.members) destination.addMember(artist);
        this.members = new ArrayList<>();
    }
}
