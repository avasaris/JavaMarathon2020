package day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }

    public void addOrder(int inc) {
        countOrder += inc;
    }

    public void addBalance(int inc) {
        balance += inc;
    }
}
