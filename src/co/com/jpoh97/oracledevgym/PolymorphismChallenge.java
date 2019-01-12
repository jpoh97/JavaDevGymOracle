package co.com.jpoh97.oracledevgym;

public class PolymorphismChallenge {
    static abstract class Simpson {
        void talk() {
            System.out.println("Simpson!");
        }
    }

    static class Homer extends Simpson {
        void talk() {
            System.out.println("Spider Pig!");
        }
    }

    static class Bart extends Simpson {
        protected void talk() {
            System.out.println("Eat my shorts!");
        }
    }

    static class Maggie extends Simpson {
    }

    public static void main(String... doYourBest) {
        /*
        Print:
        Spider Pig!
        Eat my shorts!
        Simpson!
         */

        // version 1
        new Homer().talk();
        Simpson simpson = new Bart();
        simpson.talk();
        new Maggie().talk();

        // version 2
        Simpson homerSimpson = new Homer();
        Simpson bartSimpson = new Bart();
        Simpson maggieSimpson = new Maggie();
        homerSimpson.talk();
        bartSimpson.talk();
        maggieSimpson.talk();

        // version 3
        new Homer().talk();
        new Bart().talk();
        new Maggie().talk();
    }
}