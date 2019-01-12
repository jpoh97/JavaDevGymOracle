package co.com.jpoh97.oracledevgym;

public class EnumChallenge {

    public static void main(String[] args) {

        DragonBalls dragonBall1 = DragonBalls.FIFTH;
        DragonBalls dragonBall2 = DragonBalls.SECOND;

        // Do nothing, dragonBalls array has all cases
        DragonBalls dragonBalls[] = DragonBalls.FIRST.SECOND.THIRD.FOURTH.SIXTH.invokeShaneLong();

        for (DragonBalls dragonBall : dragonBalls) {
            if (dragonBall1.equals(dragonBall)) break;
            dragonBall2 = dragonBall1;
        }

        System.out.println((dragonBall2 == dragonBall1) ? "Same Dragonball" : "New Dragonball");
        System.out.println(dragonBall2);

        /*
        Same Dragonball
        FIFTH
         */
    }

    enum DragonBalls implements Invoker {
        FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH;

        public DragonBalls[] invokeShaneLong() {
            return DragonBalls.values();
        }
    }

    interface Invoker {
        DragonBalls[] invokeShaneLong();
    }
}
