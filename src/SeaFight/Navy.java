package SeaFight;

import java.util.ArrayList;
import java.util.List;

public class Navy {
    private final Board board;
    private final List<Ship> ships;

    public Navy(Board board) {
        this.board = board;
        ships = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public boolean isDeck(int x, int y) {
        boolean thereIsDeck = false;
        for (Ship ship : ships) {
            thereIsDeck = thereIsDeck || ship.isMyDeck(board.getPos(x, y));
        }
        return thereIsDeck;
    }

    public boolean isAreal(int x, int y) {
        boolean thereIsAreal = false;
        for (Ship ship : ships) {
            thereIsAreal = thereIsAreal || ship.isMyAreal(board.getPos(x, y));
        }
        return thereIsAreal;
    }

    public boolean isDeck(Board.Position deck) {
        boolean thereIsDeck = false;
        for (Ship ship : ships) {
            thereIsDeck = thereIsDeck || ship.isMyDeck(deck);
        }
        return thereIsDeck;
    }

    public boolean isAreal(Board.Position deck) {
        boolean thereIsAreal = false;
        for (Ship ship : ships) {
            thereIsAreal = thereIsAreal || ship.isMyAreal(deck);
        }
        return thereIsAreal;
    }

    public void hitAt(int x, int y) {
        board.hitAt(x, y);
    }

    public boolean isHitDeck(int x, int y) {
        return isDeck(x, y) && board.getPos(x, y).isHit();
    }

    public void checkAllShipsAlive() {
        for (Ship ship : ships) {
            if (!ship.isAlive()) continue;
            boolean isItAlive = false;
            for (Board.Position deck : ship.getDecks()) {
                isItAlive = isItAlive || !deck.isHit();
            }
            if (!isItAlive) ship.setAlive(false);
        }
    }

    public boolean isShipBlowUp() {
        boolean answer = false;
        for (Ship ship : ships) {
            if (!ship.isAlive() && ship.isHidden()) {
                answer = true;
                ship.setHidden(false);
                for (Board.Position pos : ship.getAreal()) board.hitAt(pos);
            }
        }
        return answer;
    }

    public void addShip(Ship ship) throws IllegalArgumentException {
        for (Board.Position pos : ship.getDecks()) {
            if (isDeck(pos)) throw new IllegalArgumentException("Палубы кораблей пересекаются.");
            if (isAreal(pos)) throw new IllegalArgumentException("Корабли в недопустимой близости.");
        }
        ships.add(ship);
    }

    public boolean isNavyBlowUp() {
        boolean isNavyAlive = false;
        for(Ship ship: ships){
            isNavyAlive = isNavyAlive || ship.isAlive();
        }
        return !isNavyAlive;
    }
}
