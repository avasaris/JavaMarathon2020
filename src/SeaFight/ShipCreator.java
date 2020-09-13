package SeaFight;

import java.util.ArrayList;
import java.util.List;

public class ShipCreator {
    private final Board board;

    public ShipCreator(Navy navy) {
        this.board = navy.getBoard();
    }

    public Ship createShip(List<int[]> input) {
        List<Board.Position> decks = new ArrayList<>();
        List<Board.Position> areal = new ArrayList<>();

        for (int[] inp : input) {
            decks.add(board.getPos(inp[0], inp[1]));
        }

        for (Board.Position deck : decks) {
            addAreal(areal, deck.getX() - 1, deck.getY() - 1);
            addAreal(areal, deck.getX() - 1, deck.getY());
            addAreal(areal, deck.getX() - 1, deck.getY() + 1);
            addAreal(areal, deck.getX(), deck.getY() - 1);
            addAreal(areal, deck.getX(), deck.getY() + 1);
            addAreal(areal, deck.getX() + 1, deck.getY() - 1);
            addAreal(areal, deck.getX() + 1, deck.getY());
            addAreal(areal, deck.getX() + 1, deck.getY() + 1);
        }
        areal.removeAll(decks);

        return new Ship(decks, areal);
    }

    private void addAreal(List<Board.Position> areal, int x, int y) {
        if (board.positionExists(x, y)) areal.add(board.getPos(x, y));
    }

}
