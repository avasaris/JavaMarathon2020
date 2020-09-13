package SeaFight;

import java.util.List;

public class Ship {
    private final List<Board.Position> decks;
    private final List<Board.Position> areal;
    private boolean alive;
    private boolean hidden;

    public Ship(List<Board.Position> decks, List<Board.Position> areal) {
        this.decks = decks;
        this.areal = areal;
        this.alive = true;
        this.hidden = true;
    }

    public boolean isMyDeck(Board.Position deck) {
        return decks.contains(deck);
    }

    public boolean isMyAreal(Board.Position areal) {
        return this.areal.contains(areal);
    }

    public List<Board.Position> getDecks() {
        return decks;
    }

    public List<Board.Position> getAreal() {
        return areal;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
