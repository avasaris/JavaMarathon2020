package SeaFight;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Position> board;

    public Board() {
        board = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                board.add(new Position(i, j));

    }

    public Position getPos(int x, int y) {
        return board.get(x * 10 + y);
    }

    public boolean positionExists(int x, int y) {
        return x >= 0 && x < 10 && y >= 0 && y < 10;
    }

    public void hitAt(int x, int y) {
        getPos(x, y).hit = true;
    }

    public void hitAt(Board.Position pos){
        pos.hit = true;
    }

    public boolean isHitPos(int x, int y){
        return getPos(x,y).isHit();
    }

    public class Position {
        private final int x;
        private final int y;
        private boolean hit;

        private Position(int x, int y) {
            this.x = x;
            this.y = y;
            this.hit = false;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public boolean isHit() {
            return hit;
        }


    }
}
