package day6;

public class Bike extends Transport {
    public Bike(String model, String color, int year) {
        super(model, color, year);
    }

    @Override
    public void printType() {
        System.out.println("Это мотоцикл");
    }
}
