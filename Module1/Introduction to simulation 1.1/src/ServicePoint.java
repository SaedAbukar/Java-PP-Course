import java.util.LinkedList;
import java.util.Random;

public class ServicePoint {
    LinkedList<Customer> queue = new LinkedList<>();
    Random rand = new Random(123);

    public void addToQueue(Customer customer) {
        queue.addFirst(customer);
        customer.setStartTime();
    }

    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            customer.setEndTime();
            int sleepTime = rand.nextInt(10) + 1;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long serviceTime = customer.getTime() + sleepTime;
            System.out.printf("Customer %d service time: %d milliseconds%n", customer.getId(), serviceTime);
        }
    }
}
