import java.util.ArrayList;
import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventPriorityQueue = new PriorityQueue<>();

    public void addToPriorityQueue(Event event) {
        eventPriorityQueue.add(event);
    }

    public Event removeFromPriorityQueue() {
        return eventPriorityQueue.poll();
    }

    public void displayPriorityQueue() {
        System.out.println(eventPriorityQueue);
    }

    public ArrayList sortedQueue() {
        PriorityQueue<Event> priorityQueue = new PriorityQueue<>(eventPriorityQueue);
        ArrayList<Event> sortedEvents = new ArrayList<>();
        for (int i = 0; i < eventPriorityQueue.size(); i++) {
            sortedEvents.add(priorityQueue.poll());
        }
        return sortedEvents;
    }



}