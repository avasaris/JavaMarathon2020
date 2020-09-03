package day11;

public class Courier extends Human implements Worker {
    private static final int MY_SALARY = 100;
    private static final int BONUS_LEVEL = 1_000_000;

    public Courier(Warehouse warehouse) {
        super(warehouse, "Courier");
    }

    @Override
    public void doWork() {
        salary += MY_SALARY;
        warehouse.addBalance(1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= BONUS_LEVEL && bonusNotPayed) {
            salary *= 2;
            bonusNotPayed = false;
        }
    }
}
