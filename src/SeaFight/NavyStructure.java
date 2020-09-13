package SeaFight;

public enum NavyStructure {
    S1(ShipType.SHIP4, "первого"),
    S2(ShipType.SHIP3, "первого"),
    S3(ShipType.SHIP3, "второго"),
    S4(ShipType.SHIP2, "первого"),
    S5(ShipType.SHIP2, "второго"),
    S6(ShipType.SHIP2, "третьего"),
    S7(ShipType.SHIP1, "первого"),
    S8(ShipType.SHIP1, "второго"),
    S9(ShipType.SHIP1, "третьего"),
    S10(ShipType.SHIP1, "четвертого");

    private final ShipType st;
    private final String adjective;

    NavyStructure(ShipType st, String adjective) {
        this.st = st;
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        return String.format(st.toString(), adjective);
    }

    public ShipType getShipType() {
        return st;
    }
}
