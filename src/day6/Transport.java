package day6;

abstract class Transport {
    private int year;
    private String color;
    private String model;

    public Transport(String model, String color, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public Transport() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void printType();

    public int yearsDiff(int year){
        return year - this.year;
    }
}
