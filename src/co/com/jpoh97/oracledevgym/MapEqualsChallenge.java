package co.com.jpoh97.oracledevgym;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapEqualsChallenge {

    public static void main(String... doYourBest) {
        Map<Stark, String> map = new LinkedHashMap<>();

        map.put(new Stark("Arya"), "1"); map.put(new Stark("Ned"), "2");
        map.put(new Stark("Sansa"), "3"); map.put(new Stark("Bran"), "4");
        map.put(new Stark("Jaime"), "5");

        map.forEach((k, v) -> System.out.println(v));

        /* print
        4 -> replace value 1, and keep in first position
        2
        5
         */
    }

    static class Stark {
        String name;

        Stark(String name) {
            this.name = name;
        }

        public boolean equals(Object obj) {
            return ((Stark)obj).name.length() == this.name.length();
        }

        // Always return 4000, without hashcode print all values
        public int hashCode() {
            return 4000 << 2 * 2000 / 10000;
        }
    }

}
