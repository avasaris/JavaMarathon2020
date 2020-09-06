package day12;

public class Task4 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand("Muse", 1995);
        MusicBand bandB = new MusicBand("Linkin Park", 2001);

        bandA.addMember("Alice");
        bandA.addMember("Bob");
        bandA.addMember("Martin");

        bandB.addMember("Helen");
        bandB.addMember("Cristie");

        System.out.println("First band members: " + bandA.getMembers());
        System.out.println("Second band members: " + bandB.getMembers());

        System.out.println("Let's move all members....");

        bandA.moveMembersTo(bandB);

        System.out.println("First band members: " + bandA.getMembers());
        System.out.println("Second band members: " + bandB.getMembers());

        bandB.moveMembersTo(bandA);

        System.out.println("First band members: " + bandA.getMembers());
        System.out.println("Second band members: " + bandB.getMembers());

    }
}
