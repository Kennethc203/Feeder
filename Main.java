public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(1000);
        System.out.println("Current Food = " + f.getCurrentFood());
        System.out.println((int) (Math.random() * 41) + 10);
        System.out.println((Math.random() < 0.05));
        f.simulateOneDay(22);
        System.out.println("Current Food = " + f.getCurrentFood());

    }
}