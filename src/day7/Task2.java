package day7;

/*
 * Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при создании должен иметь
 * значение выносливости от 90 до 100. Создать 6 игроков, вызвать метод info(). При попытке создать 7,8 … n игрока,
 * количество игроков на поле меняться не должно, проверить это.
 * Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается).
 * Вывести количество игроков на поле.
 */

public class Task2 {

    public static void main(String[] args) {

        final int N = 10; // <--- создадим 10 игроков

        Player[] players = new Player[N];

        for (int i = 0; i < N; i++) {
            players[i] = new Player();
        }

        // Посмотрим сколько игроков на поле
        System.out.println("Players on the field: " + Player.getCountPlayers());

        // Пусть первый игрок набегается
        System.out.println("Player #1 stamina (before): " + players[0].getStamina());

        for (int i = 0; i < Player.MAX_STAMINA; i++) {
            if (players[0].getStamina() > Player.MIN_STAMINA) players[0].run();
        }

        System.out.println("Player #1 stamina (after): " + players[0].getStamina());

        // Посмотрим сколько игроков на поле
        System.out.println("Players on the field: " + Player.getCountPlayers());

    }


}
