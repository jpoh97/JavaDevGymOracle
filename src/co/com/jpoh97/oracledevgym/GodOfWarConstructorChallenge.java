package co.com.jpoh97.oracledevgym;

import java.math.BigDecimal;

public class GodOfWarConstructorChallenge {

    String name;

    GodOfWarConstructorChallenge(String name) {
        this.name = name;
    }

    GodOfWarConstructorChallenge() {
        this(getName(1));
    }

    GodOfWarConstructorChallenge(int i) {
        this(getName(2));
    }

    GodOfWarConstructorChallenge(Object i) {
        this(getName((Integer) i));
    }

    static String getName(int index) {
        String name = new String[]{"Kratos", "Zeus",
                "Poseidon", "Hades", "Athena"}[index];
        return name;
    }

    public static void main(String... doYourBest) {

        // Print "Zeus Kratos Athena"

        // version 1

        GodOfWarConstructorChallenge firstGod =
                new GodOfWarConstructorChallenge();
        GodOfWarConstructorChallenge secondGod =
                new GodOfWarConstructorChallenge("Kratos");

        GodOfWarConstructorChallenge thirdGod =
                new GodOfWarConstructorChallenge(Integer.valueOf(4));


        System.out.print(firstGod.name + " ");
        System.out.print(secondGod.name + " ");
        System.out.print(thirdGod.name);

        // version 2

        firstGod =
                new GodOfWarConstructorChallenge(Integer.valueOf(1));
        secondGod =
                new GodOfWarConstructorChallenge(Integer.valueOf(0));

        thirdGod =
                new GodOfWarConstructorChallenge(Integer.valueOf(4));


        System.out.println();
        System.out.print(firstGod.name + " ");
        System.out.print(secondGod.name + " ");
        System.out.print(thirdGod.name);

        // version 3

        firstGod =
                new GodOfWarConstructorChallenge();
        secondGod =
                new GodOfWarConstructorChallenge(BigDecimal.valueOf(0)); // An Exception will be thrown because a BigDecimal can't be cast to Integer.

        thirdGod =
                new GodOfWarConstructorChallenge(Long.valueOf(4));


        System.out.print(firstGod.name + " ");
        System.out.print(secondGod.name + " ");
        System.out.print(thirdGod.name);
    }

}
