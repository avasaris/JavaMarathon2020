package SeaFight;

public enum ShipType {
    SHIP4("Введите координаты %s четырехпалубного корабля (формат: x1,y1; x2,y2; x3,y3; x4,y4): ", 4),
    SHIP3("Введите координаты %s трехпалубного корабля (формат: x1,y1; x2,y2; x3,y3): ", 3),
    SHIP2("Введите координаты %s двухпалубного корабля (формат: x1,y1; x2,y2): ", 2),
    SHIP1("Введите координаты %s однопалубного корабля (формат: x1,y1): ", 1);

    private final String message;
    private final int length;

    ShipType(String message, int length) {
        this.message = message;
        this.length = length;
    }

    @Override
    public String toString() {
        return message;
    }

    public int getLength() {
        return length;
    }
}
