package day12;

public class Task5 {
    public static void main(String[] args) {
        MusicBandExt bandA = new MusicBandExt("Muse", 1995);
        MusicBandExt bandB = new MusicBandExt("Linkin Park", 2001);

        bandA.addMember("Alice", 1975);
        bandA.addMember("Bob", 1985);
        bandA.addMember("Martin", 1995);

        bandB.addMember("Helen",2000);
        bandB.addMember("Cristie", 2005);

        System.out.println("First band members: " + bandA.getMembers());
        System.out.println("Second band members: " + bandB.getMembers());

        System.out.println("Let's move all members....");

        bandA.moveMembersTo(bandB);

        System.out.println("First band members: " + bandA.getMembers());
        System.out.println("Second band members: " + bandB.getMembers());

    }
}
