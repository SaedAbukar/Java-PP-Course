import eduni.distributions.Normal;

public class ArrivalProcess {
    Normal normal;
    Event.EventType event;

    public ArrivalProcess(Normal normal) {
        this.normal = normal;
        event = Event.EventType.ARRIVAL;
    }

    public void addEvent(EventList eventList) {
        Clock time = Clock.getInstance();
        int currentTime = time.getTime();
        int random = (int) normal.sample();
        int eventInterval = currentTime + random;
        Event arrival = new Event(eventInterval, event);

        eventList.addToPriorityQueue(arrival);
        time.setTime(eventInterval);
    }
}

