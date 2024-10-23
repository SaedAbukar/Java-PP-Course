public class Task1_3 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        int range = 1000;

        customer.setStartTime();
        for (int i = 0; i < range; i++) {
            System.out.println("Customer is being served");
        }
        customer.setEndTime();
        System.out.println("Customer has been served the market");
        customer.getTime();
        System.out.printf("The customer %d was served in %d milliseconds.%n", customer.getId(), customer.getTime());
    }
}
