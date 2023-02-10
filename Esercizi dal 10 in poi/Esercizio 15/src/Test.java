public class Test {
    public static void main(String[] args) {
        double ourInvestments = fetchOurInvestmentReturns(1_000, 8);
        double todaysWeather = fetchTodaysWeather ();
        boolean isWeekend = isWeekend("SUNDAY");

        System.out.println(ourInvestments);
        System.out.println(todaysWeather);
        System.out.println(isWeekend);

        if (ourInvestments >= 1_500 && todaysWeather > 27 && isWeekend){
            System.out.println("Nnamo ar mare");
        }else System.out.println("Statt a cas");
    }

    private static boolean isWeekend (String currentDayName){
        return currentDayName.toLowerCase().equals("saturday") ||
                currentDayName.toLowerCase().equals("sunday");
    }
  private static Double fetchTodaysWeather (){
        return Math.random() * 35;
  }
    private static Double fetchOurInvestmentReturns (double initialInvestmentsEuros, int yearsInvested){
        for (int i = 0; i < yearsInvested; i++) {
            initialInvestmentsEuros = initialInvestmentsEuros * 1.08;
        }

        return (initialInvestmentsEuros);
    }
}
