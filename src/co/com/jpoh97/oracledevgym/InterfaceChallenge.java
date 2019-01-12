package co.com.jpoh97.oracledevgym;

import java.util.function.Function;

public class InterfaceChallenge {

    interface Jedi {
        String MASTER = "Joda";

        default String attack() {
            return jump(jedi -> String.join(jedi, useSaber(), useForce()));
        }

        private String jump(Function<String, String> function) {
            return function.apply("Luke");
        }

        private static String useSaber() {
            return "S";
        }

        private String useForce() {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Jedi() {
            public String useForce() {
                return "X";
            }
        }.attack() + Jedi.useSaber() + Jedi.MASTER);

        // SLukeFSJoda
    }
}
