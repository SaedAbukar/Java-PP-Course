public class Task1_5 {
    public static void main(String[] args) {
        CustomerGenerator customerGenerator = new CustomerGenerator();
        ServicePoint servicePoint = new ServicePoint();

        customerGenerator.GenerateCustomers(servicePoint, 10);
        servicePoint.serve();
    }
}
