public class Event implements Comparable<Event>{
    public enum EventType {
        ARRIVAL, EXIT
    }
    
    public EventType type;
    private int time;
    
    public Event(int time, EventType type) {
        this.time = time;
        this.type = type;
    }

    public EventType getType() {
        return type;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Event o) {
        if(this.time == o.time) {
            return 0;
        }else if(this.time > o.time) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Event: " + type + " Time: " + time;
    }
}
