import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task1_4 {
    static Scanner reader = new Scanner(System.in);
    static Random rand = new Random();

    private static void responseValidator(int response) {
        while (response < 1 || response > 2) {
            System.out.println("Please enter a number between 1 and 2");
            response = Integer.parseInt(reader.nextLine());
        }
    }
    public static void main(String[] args) {
        LinkedList<Customer> customers = new LinkedList<>();
        System.out.println("How many customer interaction do yo want to simulate?");
        int amount = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < amount; i++) {
            Customer customer = new Customer();
            System.out.println("Do you want to add the customer to the queue? Yes (1) / No (2)");
            int response = Integer.parseInt(reader.nextLine());
            responseValidator(response);
            if (response == 1) {
                customers.addFirst(customer);
                customer.setStartTime();
                System.out.printf("Customer %d successfully added%n", customer.getId());
            } else {
                System.out.println("Customer not added");
            }
        }

        while (!customers.isEmpty()) {
            System.out.println("Do you want to remove the customer from the queue? Yes (1) / No (2)");
            int response = Integer.parseInt(reader.nextLine());
            responseValidator(response);

            if (response == 1) {
                Customer customer = customers.removeLast();
                customer.setEndTime();
                System.out.println("Customer removed.");
                System.out.printf("Customer %d's time in the queue was %d seconds%n", customer.getId(), customer.timeToSeconds());
            }else {
                System.out.println("Customer not removed.");
            }
        }
    }
}
