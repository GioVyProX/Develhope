public class Test {
    public static void main(String[] args) {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;


        while (remainingPoundsToSell != 0){
            daysToSell++;
            if (poundToEuroExchangeRate > 1.15){

                remainingPoundsToSell = remainingPoundsToSell - maxPoundsToSellPerDay;
            }
            System.out.println(poundToEuroExchangeRate);
            System.out.println(daysToSell);
            System.out.println(remainingPoundsToSell);

        }

        // Write your while loop here

        System.out.println("It took " + daysToSell + " days to exit that cursed economy");

    }
}
