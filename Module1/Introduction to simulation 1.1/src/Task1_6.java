public class Task1_6 {
    public static void main(String[] args) {
        CustomerGenerator customerGenerator = new CustomerGenerator();
        ServicePoint servicePoint = new ServicePoint();
        int customerCount = 10;

        customerGenerator.GenerateCustomers(servicePoint, customerCount);
        int averageServiceTime = servicePoint.serve() / customerCount;

        System.out.printf("Average service time is %d milliseconds%n", averageServiceTime);
    }
}
