package co.com.jpoh97.oracledevgym;

/*
If you just invoke run() directly, it's executed on the calling thread, just like any other method call.
 Thread.start() is required to actually create a new thread so that the runnable's run method is executed in parallel.
 */
public class DaemonThreadChallenge implements Runnable {

    public static void main(String... doYourBest) {

        // The JVM will be executing the looping from the run method forever.
        Thread thread = new Thread(new DaemonThreadChallenge());

        /* Doesnt work

        There are two types of Threads, non-daemon, and daemon.
        The Thread of the main method is non-daemon, that means that the instructions inside this method will be executed until the end.
        When we define a daemon Thread it means that this Thread may or may not be fully executed. The JVM just execute this Thread but it doesn't matter if this method will be finished or not.
        What matters is that all non-daemon Threads be finished.
        With that said, the looping will not be executed forever.
         */
        thread.setDaemon(true);
        thread.start();

        /* Works

        We are setting up this instance of a Thread to non-daemon. In that case, the for looping will be executed forever.
         */
        thread.setDaemon(false);
        thread.start();

        /* Works

        There is a trick here. Although the instance of this Thread is a daemon, there is no Thread being started, there is no second process being executed.
        we are only invoking the run that is inside the main Thread. The looping from the run method will be executed forever.
         */
        thread.setDaemon(true);
        thread.run();

        /* Doesnt work

        The IllegalThreadStateException will be thrown. The same Thread can't be started twice. There is no way of the same Thread being executed twice.
        It wouldn't make sense. In order to execute the same Thread again, we would have to instantiate a new Thread.
         */

        thread.setDaemon(true);
        thread.start();
        thread.start();
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println("For ever");
        }
    }
}
