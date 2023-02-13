import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {



            System.out.println("Exercise 1: ");
            int myBankBalanceEuro = 500;

            String suspiciousEmailMessage =
                    """
                                Hello Sir/Madam,
                                
                                I'm a prince here in [redacted] and I need help transferring my billions into 
                                Italy, please provide your bank account details and I will pay you generously.
                                
                                Thanks
                    """;

            long questionableFundsEuro = 5_000_000_000l;
            Long.parseLong(String.valueOf(myBankBalanceEuro));
            long newBalance = myBankBalanceEuro + questionableFundsEuro;
            System.out.println(newBalance);

        System.out.println((LocalDate.now()));

            //Add the questionable funds to your bank balance and print it out!
        }


    }

