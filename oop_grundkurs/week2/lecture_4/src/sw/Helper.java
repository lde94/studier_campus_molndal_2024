package sw;

public class Helper {
    public static int randomInt() {
        return (int) Math.round(Math.random() * 20);
    }

    public static void sleepForMilliSeconds(int time) {
        try {
            // Sleep for 2 seconds (2000 milliseconds)
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // Handle the exception
        }
    }
}
