public class Clock {
    private static Clock instance;
    private int time;

    private Clock(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock(0);
        }
        return instance;
    }
}
