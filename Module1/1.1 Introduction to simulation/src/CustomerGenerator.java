public class CustomerGenerator {

    public void GenerateCustomers(ServicePoint servicePoint, int customerCount) {
        for (int i = 1; i <= customerCount; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueue(customer);
        }
    }
}
