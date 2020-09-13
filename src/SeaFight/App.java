package SeaFight;

public class App {
    public static void main(String[] args) {
        Board boardOne = new Board();
        Board boardTwo = new Board();

        NavyCreator navyCreator = new NavyCreator();

        AppTest appTest = new AppTest();
        appTest.setUpOutput();
        appTest.provideInput(
                "1,0;2,0;3,0;4,0" + System.lineSeparator() +
                        "3,6;3,7;3,8" + System.lineSeparator() +
                        "4,4;5,4;6,4" + System.lineSeparator() +
                        "6,8;7,8" + System.lineSeparator() +
                        "0,5;0,6" + System.lineSeparator() +
                        "1,8;1,9" + System.lineSeparator() +
                        "2,3" + System.lineSeparator() +
                        "9,2" + System.lineSeparator() +
                        "9,9" + System.lineSeparator() +
                        "6,6" + System.lineSeparator());

        Navy navyOne = navyCreator.setBoard(boardOne).initFromConsole("Начнем расставлять корабли на поле Первого игрока. Второй игрок не смотри!");

        appTest.provideInput(
                "1,0;2,0;3,0;4,0" + System.lineSeparator() +
                        "3,6;3,7;3,8" + System.lineSeparator() +
                        "4,4;5,4;6,4" + System.lineSeparator() +
                        "6,8;7,8" + System.lineSeparator() +
                        "0,5;0,6" + System.lineSeparator() +
                        "1,8;1,9" + System.lineSeparator() +
                        "2,3" + System.lineSeparator() +
                        "9,2" + System.lineSeparator() +
                        "9,9" + System.lineSeparator() +
                        "6,6" + System.lineSeparator());

        Navy navyTwo = navyCreator.setBoard(boardTwo).initFromConsole("Начнем расставлять корабли на поле Второго игрока. Первый игрок не смотри!");

        appTest.restoreSystemInputOutput();

        Play play = new Play(navyOne, navyTwo);
        play.loop();

    }
}
