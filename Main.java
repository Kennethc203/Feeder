public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(0);
        System.out.println("Feed lasted for " + f.simulateManyDays(5,10) + " days.");
        Feeder n = new Feeder(100000);
        System.out.println("Feed lasted for " + n.simulateManyDays(20,30) + " days.");

    }
}