package co.com.jpoh97.oracledevgym;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TakeAndDropWhileChallenge {

    public static void main(String[] args) {
        List<Integer> alucardHits = List.of(9, 7, 1, 8, 5);
        Set<Integer> draculaHits = Set.of(9, 7, 1, 8, 5);

        // Always return 7
        Stream<Integer> alucardPerformedHits = alucardHits.stream()
                .takeWhile(i -> i > 5)
                .dropWhile(i -> i > 8);

        // Depend of the current order of Set
        Stream<Integer> draculaPerformedHits = draculaHits.stream()
                .takeWhile(i -> i > 1)
                .dropWhile(i -> i > 7);

        Stream.of(alucardPerformedHits, draculaPerformedHits).flatMap(h -> h)
                .forEach(System.out::println);

        // Print always 7 and take different values of draculaPerformedHits in every execution
    }
}
