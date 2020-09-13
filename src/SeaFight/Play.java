package SeaFight;

import java.util.Random;

public class Play {
    private final Navy[] navy;

    public Play(Navy navyOne, Navy navyTwo) {
        navy = new Navy[2];
        this.navy[0] = navyOne;
        this.navy[1] = navyTwo;
    }

    public void printOpenedBoard(Navy[] navy) {
        System.out.println("Исходная расстановка:");
        System.out.println("Поле боя 1:\t\t\t\t\t\t\t\t\t\t\tПоле боя 2:");
        System.out.print(" \t");
        for (int j = 0; j < 10; j++) System.out.print(j + "\t");
        System.out.print("\t\t \t");
        for (int j = 0; j < 10; j++) System.out.print(j + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 10; j++) {
                if (navy[0].isDeck(i, j)) {
                    System.out.print("\uD83D\uDEE5\t");
                } else if (navy[0].isAreal(i, j)) {
                    System.out.print("\uD83D\uDFE6\t");
                } else {
                    System.out.print("⬜\t");
                }
            }
            System.out.print("\t\t");
            System.out.print(i + "\t");
            for (int j = 0; j < 10; j++) {
                if (navy[1].isDeck(i, j)) {
                    System.out.print("\uD83D\uDEE5\t");
                } else if (navy[1].isAreal(i, j)) {
                    System.out.print("\uD83D\uDFE6\t");
                } else {
                    System.out.print("⬜\t");
                }
            }
            System.out.println();
        }
    }

    public void printClosedBoard(Navy[] navy) {
        System.out.println("Поле боя 1:\t\t\t\t\t\t\t\t\t\t\tПоле боя 2:");
        System.out.print(" \t");
        for (int j = 0; j < 10; j++) System.out.print(j + "\t");
        System.out.print("\t\t \t");
        for (int j = 0; j < 10; j++) System.out.print(j + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 10; j++) {
                if (navy[0].isHitDeck(i, j)) {
                    System.out.print("🔥\t");
                } else if (navy[0].getBoard().isHitPos(i, j)) {
                    System.out.print("\uD83D\uDFE5\t");
                } else {
                    System.out.print("⬜\t");
                }
            }
            System.out.print("\t\t");
            System.out.print(i + "\t");
            for (int j = 0; j < 10; j++) {
                if (navy[1].isHitDeck(i, j)) {
                    System.out.print("🔥\t");
                } else if (navy[1].getBoard().isHitPos(i, j)) {
                    System.out.print("\uD83D\uDFE5\t");
                } else {
                    System.out.print("⬜\t");
                }
            }
            System.out.println();
        }
    }

    public void loop() {

        printOpenedBoard(navy);

        boolean[] playerWin = {false, false};
        Random rnd = new Random();
        int turn1 = rnd.nextInt(2);     // Индекс игрока, ходящего первым
        int turn2 = (turn1 + 1) % 2;              // Индекс противоположного игрока

        int count = 0;

        while (!playerWin[0] && !playerWin[1]) {

            // Сгенерируем произвольные не повторяющиеся координаты для хода
            int x, y;
            do {
                x = rnd.nextInt(10);
                y = rnd.nextInt(10);
            } while (navy[turn2].getBoard().isHitPos(x, y));

            System.out.println();
            System.out.printf("Игрок №%d делает ход: %d,%d\n", (turn1 + 1), x, y);

            navy[turn2].hitAt(x, y);

            if (navy[turn2].isHitDeck(x, y)) {
                System.out.println("ПОПАЛ!");
                turn1++;                                // Оставим ход за первым игроком
                navy[turn2].checkAllShipsAlive();       // Обновим статусы кораблей
                if (navy[turn2].isShipBlowUp()) {
                    System.out.println("ПОДБИЛ!!!");
                }
            } else {
                System.out.println("Мимо! Переход хода.");
            }

            turn1 = (turn1 + 1) % 2; // Переход хода.
            turn2 = (turn1 + 1) % 2;

            // Проверка на победителя
            playerWin[0] = navy[1].isNavyBlowUp();
            playerWin[1] = navy[0].isNavyBlowUp();

            printClosedBoard(navy);

            if (count++ > 201) break;  // Если зациклилились где-то.

        }

        if (playerWin[0]) System.out.println("ИГРОК №1 ПОБЕДИЛ!!!");
        if (playerWin[1]) System.out.println("ИГРОК №2 ПОБЕДИЛ!!!");

    }
}
