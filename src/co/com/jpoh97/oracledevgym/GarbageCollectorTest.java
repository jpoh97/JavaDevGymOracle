package co.com.jpoh97.oracledevgym;

public class GarbageCollectorTest {

    public static void main(String[] args) {

        HowManyObjectsWillBeCleanedByTheGarbageCollector gc = new GarbageCollectorTest()
                .new HowManyObjectsWillBeCleanedByTheGarbageCollector();

        gc.executeAction();

        System.out.println("How many objects are eligible be collected by "
                + "the Garbage Collector after "
                + "the executeAction() method invokation?" + gc);

    }

    private class HowManyObjectsWillBeCleanedByTheGarbageCollector {

        private Character homer = new Character("Dooh");

        private Character misterBurns = new Character("you are fired");

        private Character bart = new Character("eat my shorts");

        private Character elBarto;

        void executeAction() {
            homer.talk();
            misterBurns.talk();
            makeTwoCharactersTalk(misterBurns, homer);
            misterBurns = null;
            elBarto = bart;
            bart = null;
            elBarto.talk();
        }

        private void makeTwoCharactersTalk(Character misterBurns, Character homer) {
            misterBurns.talk();
            homer.talk();
            misterBurns = null;
            homer = null;
        }
    }
}

class Character {

    private String talk;

    Character(String talk) {
        this.talk = talk;
    }
    void talk() {
        System.out.println(this.talk);
    }
}
