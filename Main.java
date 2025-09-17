public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(0);
        System.out.println(f);
        System.out.println("Current Food: " + f.getCurrentFood());
        System.out.println((int) (Math.random() * 41) + 10);
        System.out.println(Math.random() < 0.05);
        System.out.println("Current Food: " + f.getCurrentFood());
        f.simulateOneDay(22);
        System.out.println("Current Food: " + f.getCurrentFood());
        System.out.println("Feed lasted for " + f.simulateManyDays(5,10) + " days.");
        Feeder n = new Feeder(100000);
        System.out.println("Feed lasted for " + n.simulateManyDays(20,30) + " days.");
    }
}