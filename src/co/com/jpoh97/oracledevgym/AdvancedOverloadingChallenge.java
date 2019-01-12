package co.com.jpoh97.oracledevgym;

public class AdvancedOverloadingChallenge {
    static String x = "";
    public static void main(String... doYourBest) {
        executeAction(1);
        executeAction(1.0);
        executeAction(Double.valueOf("5"));
        executeAction(1L);

        System.out.println(x);
        // efce

        x = "";
        executeAction(1);
        executeAction(1.0);
        executeAction(Double.valueOf("5"));
        executeAction(1L);

        System.out.println(x);
        // efce
    }
    static void executeAction(int ... var) {x += "a"; }
    static void executeAction(Integer var) {x += "b"; }
    static void executeAction(Object var)  {x += "c"; }
    static void executeAction(short var)   {x += "d"; }
    static void executeAction(float var)   {x += "e"; }
    static void executeAction(double var)  {x += "f"; }
}

/*
Background
There are some important concepts here.

The first one is that when we work with advanced overloading, the JVM will choose the method to make the less effort as possible prioritizing performance.

Keep in mind the priorities by the JVM:

1 - Widening
2 - Boxing
3 - Boxing+varargs

When there is widening, the nearest type will be invoked on the method.

byte -> short -> int -> long -> float -> double
            char  ->
 */