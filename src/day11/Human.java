package day11;

public abstract class Human implements Worker {
    protected int salary;
    protected Warehouse warehouse;
    protected boolean bonusNotPayed;
    private String name;

    public Human(Warehouse warehouse, String name) {
        this.warehouse = warehouse;
        this.name = name;
        salary = 0;
        bonusNotPayed = true;
    }

    @Override
    abstract public void doWork();

    @Override
    abstract public void bonus();

    public int getSalary() {
        return salary;
    }

    public String getInfo() {
        return "I am a " + name + ". "
                + "My salary is " + salary + ". "
                + (bonusNotPayed ? "Bonus is not payed :(" : "Bonus is payed! Hurrah!");
    }
}
