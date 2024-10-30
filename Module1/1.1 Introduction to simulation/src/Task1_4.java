import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task1_4 {
    static Scanner reader = new Scanner(System.in);
    static Random rand = new Random();

    private static void servingCustomer() {
        System.out.println("Greet the customer!");
        String greet = reader.nextLine();
        System.out.println("Customer: Hello!");
        System.out.println("Do you want to pay by card or cash?");

        int payment = rand.nextInt(2) + 1;
        double totalPrice = rand.nextDouble(30) + 1;

        if (payment == 1) {
            System.out.println("Customer wants to pay by card.");
        }else {
            System.out.println("Customer wants to pay by cash.");
        }
        System.out.printf("Your total price is %.2f euro/s%n", totalPrice);
        System.out.println("Accept the payment. Yes (1)");
        int response = Integer.parseInt(reader.nextLine());
        serveSelection(response);
        System.out.println("Here is the return! Thank you for choosing us! Have a nice day!");

    }

    private static void serveSelection(int response) {
        while (response != 1) {
            System.out.println("Please serve the customer");
            response = Integer.parseInt(reader.nextLine());
        }
    }

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
                System.out.println("Customer successfully added");
            } else {
                System.out.println("Customer not added");
            }
        }

        while (!customers.isEmpty()) {
            System.out.println("Serve the Customer? Yes (1)");
            int response = Integer.parseInt(reader.nextLine());
            serveSelection(response);
            Customer customer = customers.getFirst();
            customer.setStartTime();
            servingCustomer();
            customers.removeLast();
            customer.setEndTime();
            System.out.printf("Customer %d's time in the queue was %d seconds%n", customer.getId(), customer.timeToSeconds());
        }
    }
}
