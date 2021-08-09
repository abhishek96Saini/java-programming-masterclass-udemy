package UsingConstructors;

public class UsingConstructors {

    public void runProgram() {
        Account account = new Account(12345, 1000.00,
                "BingoPops", "BingoPops@bingopops.com", "880468404");

        account.depositAmount(50);
        account.withdrawAmount(900);
        account.withdrawAmount(100);
    }
}

