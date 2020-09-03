package day11;

public class Picker extends Human implements Worker {
    private static final int MY_SALARY = 80;
    private static final int BONUS_LEVEL = 1500;

    public Picker(Warehouse warehouse) {
        super(warehouse, "Picker");
    }

    @Override
    public void doWork() {
        salary += MY_SALARY;
        warehouse.addOrder(1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() >= BONUS_LEVEL && bonusNotPayed) {
            salary *= 3;
            bonusNotPayed = false;
        }
    }
}
