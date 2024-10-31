import eduni.distributions.Normal;

public class Task1_3_7 {
    public static void main(String[] args) {
        double mean = 5;
        double variance = 2;
        long seed = 1234;
        int amount = 10;
        int size;
        Normal normal = new Normal(mean, variance, seed);
        ArrivalProcess arrivalProcess = new ArrivalProcess(normal);
        EventList arrivals = new EventList();
        Customer customer;
        Clock time = Clock.getInstance();
        ServicePoint servicePoint = new ServicePoint();

        for (int i = 0; i < amount; i++) {
            arrivalProcess.addEvent(arrivals);
        }

        size = arrivals.size();
        for (int i = 0; i < size; i++) {
            Event event = arrivals.removeFromPriorityQueue();
            customer = new Customer();
            customer.setArrivalTime(event.getTime());
            System.out.printf("Customer %d start time: %d%n", customer.getId(), customer.getArrivalTime());
            servicePoint.addToQueue(customer);
        }

        time.setTime(5);

        size = servicePoint.size();
        for (int i = 0; i < size; i++) {
            Customer servedCustomer = servicePoint.removeFromQueue();
            servedCustomer.setExitTime(time.getTime());
            System.out.printf("Customer %d clearance time: %d%n", servedCustomer.getId(), servedCustomer.getExitTime());
        }
    }
}
