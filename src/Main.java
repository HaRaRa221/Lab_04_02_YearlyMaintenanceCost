public class Main
{
    public static void main(String[] args)
    {
        int fallCost;
        int winterCost;
        int springCost;
        int summerCost;
        int yearlyCost;

        fallCost = 200;
        winterCost = 170;
        springCost = 110;
        summerCost = 100;
        yearlyCost = fallCost + winterCost + springCost + summerCost;
        System.out.println("The yearly cost of home maintenance is " + yearlyCost);

    }
}