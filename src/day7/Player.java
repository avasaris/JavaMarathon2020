package day7;

/*
 * Дворовый футбол.
 * Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player), содержит следующие поля:
 * поле “выносливость” (англ. stamina), разное для каждого экземпляра
 * константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и
 * “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров
 * статическое поле countPlayers, которое считает кол-во игроков на футбольном поле
 * (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
 *
 * и следующие методы:
 *
 * run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость на 1 при однократном вызове.
 * Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
 *
 * info() -  выводит сообщение в зависимости от кол-ва игроков на поле, если игроков менее 6, то выводит фразу
 * “Команды неполные, еще есть ... свободных мест”, иначе “Мест в командах больше нет”.
 */

public class Player {
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;
    public static final int MAX_PLAYERS = 6;

    private static int countPlayers;
    private int stamina;

    public Player() {
        this.stamina = LocalUtil.genRandomInt(MAX_STAMINA - 10, MAX_STAMINA);
        addPlayer();
    }

    public Player(int stamina) {
        this.stamina = stamina;
        addPlayer();
    }

    private static void addPlayer() {
        if (countPlayers < MAX_PLAYERS) countPlayers++;
    }

    public static String info() {
        String message = "Мест в командах больше нет";

        if (countPlayers < MAX_PLAYERS) {
            switch (MAX_PLAYERS - countPlayers) {
                case 1:
                    message = "Команды неполные, еще есть 1 свободное место";
                    break;
                case 2:
                case 3:
                case 4:
                    message = "Команды неполные, еще есть " + (MAX_PLAYERS - countPlayers) + " свободных места";
                    break;
                default:
                    message = "Команды неполные, еще есть " + (MAX_PLAYERS - countPlayers) + " свободных мест";
            }
        }

        return message;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) countPlayers--;
        }
    }
}

class LocalUtil {
    public static int genRandomInt(int low, int hi) {
        // generate random integer in range [low, hi]
        return (int) (Math.random() * (hi - low + 1) + low);
    }
}