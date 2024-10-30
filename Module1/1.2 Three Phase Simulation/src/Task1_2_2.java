public class Task1_2_2 {
    public static void main(String[] args) {
        EventList list = new EventList();
        int range = 0;

        for (int i = 10; i > range; i--) {
            Event arrivalEvent =  new Event(i, Event.EventType.ARRIVAL);
            Event exitEvent = new Event(i + 5, Event.EventType.EXIT);
            list.addToPriorityQueue(arrivalEvent);
            list.addToPriorityQueue(exitEvent);
        }

        System.out.println("Sorted queue " + list.sortedQueue());
        System.out.println("Removed " + list.removeFromPriorityQueue());
        System.out.println("Sorted queue " + list.sortedQueue());
    }
}
