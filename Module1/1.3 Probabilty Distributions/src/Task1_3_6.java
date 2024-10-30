import eduni.distributions.Normal;

public class Task1_3_6 {
    public static void main(String[] args) {
        double mean = 5;
        double variance = 2;
        long seed = 1234;
        Normal normal = new Normal(mean, variance, seed);
        ArrivalProcess arrivalProcess = new ArrivalProcess(normal);
        EventList arrivals = new EventList();
        Clock clock = Clock.getInstance();
        int amount = 10;

        for (int i = 0; i < amount; i++) {
            arrivalProcess.addEvent(arrivals);
            System.out.printf("The time is %d%n", clock.getTime());
        }
        arrivals.displayPriorityQueue();
        System.out.println(arrivals.sortedQueue());
    }
}
