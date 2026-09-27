class InsbalException extends Exception {
    public InsbalException(String message) {
        super(message);
    }
}

public class Bankaccount {
    private double balance;

    public Bankaccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsbalException {
        if (amount > balance) {
            throw new InsbalException("Insufficient balance in account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful.\n Remaning balance:" + balance);
    }

    public static void main(String args[]) {
        Bankaccount account = new Bankaccount(1000.0);
        try {
            account.withdraw(600.0);
            account.withdraw(500.0);
        } catch (InsbalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}