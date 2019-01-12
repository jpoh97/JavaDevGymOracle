package co.com.jpoh97.oracledevgym;

import java.util.function.Function;

public class FunctionChallenge2 {
    public static void main(String... doYourBest) {
        Function<Integer, Integer> add = x -> x + 2;
        Function<Integer, Integer> sub = x -> x - 2;
        Function<Integer, Integer> div = x -> x / 2;

        Function<Integer, Integer> func = add.andThen(sub).andThen(div);

        System.out.println(func.apply(2));

        // print 1
    }
}
