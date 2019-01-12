package co.com.jpoh97.oracledevgym;

import java.util.Arrays;
import java.util.List;

public class ListChallenge {

    public static void main(final String... doYourBest) {
        // final not have problem in this challenge
        // Arrays.asList returns a fixed list and if we try to change it, we are going to have an Exception
        final List<String> soldiers = Arrays.asList("Tyrion", "Arya", "John");

        if (soldiers.size() > 3) {
            soldiers.add("Cersei");
        } else {
            soldiers.add("Bran");
        }

        System.out.println(soldiers);

        // java.lang.UnsupportedOperationException will be thrown.
    }

}
