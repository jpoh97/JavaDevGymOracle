package co.com.jpoh97.oracledevgym;

public class DaemonThreadChallenge2 implements Runnable {

    public static void main(String... doYourBest) {
        Thread thread = new Thread(new DaemonThreadChallenge());
        thread.setDaemon(true); // daemon: it will die if all non-daemon threads have finished. Main method is not a daemon
        thread.start();

        // It will print "Forever" for an indeterminate time and the program will be normally finished.
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println("For ever");
        }
    }
}