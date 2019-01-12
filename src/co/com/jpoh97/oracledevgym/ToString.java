package co.com.jpoh97.oracledevgym;

public class ToString {
    static int number = 10;

    public static void main(String... doYourBest) {
        new ToString();
    }

    public ToString() {
        System.out.println(this);
        // ToString.number = 10
        // System.out.println(new MisterBean()); StackOverflow exception
    }

    public String toString() { return "ToString.number = " + number; }

    static class MisterBean extends ToString { }
}