public class YearlyMaintenanceCost {

    public static void main(String[] args)
    {
        double spring;
        double summer;
        double fall;
        double winter;
        double yearlyCost;
        System.out.println("What is the maintenance cost in Spring?: ");
        System.out.println("What is the maintenance cost in Summer?: ");
        System.out.println("What is the maintenance cost in Fall?: ");
        System.out.println("What is the maintenance cost in Winter?: ");
        spring=30;
        summer=10;
        fall=12;
        winter=100;
        yearlyCost= spring+summer+fall+winter;
        System.out.println("Your yearly maintenance cost over the 4 seasons is: $" +yearlyCost);

    }
}
