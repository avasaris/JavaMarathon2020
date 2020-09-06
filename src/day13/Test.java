package day13;

/*
 * Класс Test:
 *
 * В методе main() этого класса необходимо создать трех пользователей.
 * Затем необходимо:
 * Отправить 2 сообщения от пользователя 1 пользователю 2
 * Отправить 3 сообщения от пользователя 2 пользователю 1
 * Отправить 4 сообщения от пользователя 3 пользователю 1
 * Отправить 3 сообщения от пользователя 1 пользователю 3
 *
 * Сообщения могут быть любыми.
 * После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
 */

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Anthony");
        User user2 = new User("Boris");
        User user3 = new User("Petr");

        System.out.println("(1) Is " + user1 + " friend for " + user2 + " : " + user1.isFriend(user2));

        user1.subscribe(user2);

        System.out.println("(2) Is " + user1 + " friend for " + user2 + " : " + user1.isFriend(user2));

        user2.subscribe(user1);

        System.out.println("(3) Is " + user1 + " friend for " + user2 + " : " + user1.isFriend(user2));

        user1.sendMessage(user2, "Привет!");
        user2.sendMessage(user1, "Привет!");
        user1.sendMessage(user2, "Поехали на рыбалку!");
        user2.sendMessage(user1, "Я сегодня не могу...");
        user2.sendMessage(user1, "Я рефакторю твой код! (ノಠ益ಠ)ノ ");

        user3.sendMessage(user1, "Кофе сегодня замечательный!");
        user1.sendMessage(user3, "Еще бы, шеф привез его из Кубы.");
        user3.sendMessage(user1, "О, крутяк!");
        user3.sendMessage(user1, "А когда премия не в курсе?");
        user1.sendMessage(user3, "А никогда!");
        user3.sendMessage(user1, "В смысле?");
        user1.sendMessage(user3, "Из Кубы кофе шеф привез!");
        user3.sendMessage(user1, "А...  Тогда не крутяк :-\\");

        System.out.println("==============");
        System.out.println("Dialog between " + user1 + "(user1) and " + user2 + "(user2)");
        MessageDatabase.showDialog(user1, user2);

        System.out.println("==============");
        System.out.println("Dialog between " + user1 + "(user1) and " + user3 + "(user3)");
        MessageDatabase.showDialog(user1, user3);

        System.out.println("==============");
        System.out.println("Dialog between " + user2 + "(user2) and " + user3 + "(user3)");
        MessageDatabase.showDialog(user2, user3);

    }
}
