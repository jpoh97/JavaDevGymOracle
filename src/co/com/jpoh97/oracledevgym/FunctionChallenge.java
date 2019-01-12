package co.com.jpoh97.oracledevgym;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionChallenge {

    public static void main(String... doYourBest) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> sub = (a) -> a - 2;
        Function<Integer, Integer> mult = (a) -> a * 3;

        // Get 6 when consumer.accept

        // version 1

        BiConsumer<Integer, Integer> consumer = (a, b)
                -> System.out.println(a + 2 + b + 2);

        BiFunction<Integer, Integer, Integer> func =
                add.andThen(sub).andThen(sub).andThen(sub);
        int firstResult = func.apply(2, 2);

        add.andThen(sub).andThen(mult);
        int secondResult = add.apply(2, 2);

        consumer.accept(firstResult, secondResult);

        // version 2

        func =
                add.andThen(sub).andThen(sub).andThen(sub);
        firstResult = func.apply(2, 2);

        BiFunction<Integer, Integer, Integer> func2 =
                add.andThen(sub).andThen(mult).andThen(sub);
        secondResult = func2.apply(2, 2);

        consumer.accept(firstResult, secondResult);

        // version 3

        Function<Integer, Integer> func3 =
                sub.andThen(sub).andThen(sub);
        firstResult = func3.apply(2);

        secondResult = mult.apply(2);


        consumer.accept(firstResult, secondResult);
    }
}
