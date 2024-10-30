public class Task1_3_5 {
    public static void main(String[] args) {
        Clock time = Clock.getInstance();
        Clock time2 = Clock.getInstance();
        Clock time3 = Clock.getInstance();

        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);

        time.setTime(5);
        time2.setTime(10);
        time3.setTime(15);

        System.out.println(time.getTime());
        System.out.println(time2.getTime());
        System.out.println(time3.getTime());
    }
}
