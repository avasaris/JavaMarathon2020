package day12;

/*
 * Доработать класс MusicBand из прошлого задания таким образом, чтобы в группу можно было добавлять
 * и удалять участников. Под участником понимается строка (String) с именем и фамилией. Реализовать
 * метод слияния групп, т.е. все участники группы А все переходят в группу B (участники не могут
 * находиться в двух группах одновременно). Реализовать метод, выводящий список участников в консоль.
 * Проверить состав групп после слияния.
 */

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
