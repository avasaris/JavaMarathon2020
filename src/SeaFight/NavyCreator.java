package SeaFight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NavyCreator {
    private Navy navy;

    public NavyCreator setBoard(Board board) {
        this.navy = new Navy(board);
        return this;
    }

    public Navy initFromConsole(String message) {
        System.out.println();
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);

        for (NavyStructure ns : NavyStructure.values()) {
            boolean passAllChecks = false;
            while (!passAllChecks) {
                System.out.print(ns);
                try {
                    List<int[]> allCoords = new ArrayList<>();

                    String input = scanner.nextLine();

                    String[] sCoords = input.trim().split("\\s*;\\s*");
                    if (sCoords.length != ns.getShipType().getLength())
                        throw new IllegalArgumentException("Недостаточно координат.");

                    for (String sCoord : sCoords) {
                        String[] sNums = sCoord.trim().split("\\s*,\\s*");
                        if (sNums.length != 2)
                            throw new IllegalArgumentException("Неверно заданы координаты одной из палуб.");
                        int x = Integer.parseInt(sNums[0]);
                        int y = Integer.parseInt(sNums[1]);
                        if (x < 0 || x > 9 || y < 0 || y > 9) throw new IllegalArgumentException("Координаты за игровым полем.");
                        allCoords.add(new int[]{x, y});
                    }

                    boolean xIsConstant = true;
                    boolean yIsConstant = true;
                    boolean yIsGrow = true;
                    boolean xIsGrow = true;
                    for(int i=0; i<allCoords.size()-1; i++){
                        xIsConstant = xIsConstant && (allCoords.get(i)[0]==allCoords.get(i+1)[0]);
                        yIsGrow = yIsGrow && (allCoords.get(i)[1]==allCoords.get(i+1)[1]-1);
                        yIsConstant = yIsConstant && (allCoords.get(i)[1]==allCoords.get(i+1)[1]);
                        xIsGrow = xIsGrow && (allCoords.get(i)[0]==allCoords.get(i+1)[0]-1);
                    }

                    if(!(xIsConstant && yIsGrow) && !(yIsConstant && xIsGrow)) throw new IllegalArgumentException("Координаты палуб не последовательны.");

                    ShipCreator shipCreator = new ShipCreator(navy);
                    Ship ship = shipCreator.createShip(allCoords);
                    navy.addShip(ship);

                    passAllChecks = true;

                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод! Не могу распознать координату. Пожалуйста, введите координаты корабля заново!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Неверный ввод! " + e.getMessage() + " Пожалуйста, введите координаты корабля заново!");
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        }

        scanner.close();

        return navy;
    }
}
