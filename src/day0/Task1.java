package day0;

public class Task1 {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.say());
    }
}

class Greetings {
    private final String prase;

    public Greetings(String prase) {
        this.prase=prase;
    }

    public Greetings() {
        this.prase="Hello, world!";
    }

    public String say() {
        return prase;
    }
}