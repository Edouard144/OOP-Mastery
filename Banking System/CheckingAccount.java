// Subclass of Account
class CheckingAccount extends Account {
    private double transactionFee;

    // Constructor uses super() to initialize base class
    public CheckingAccount(int accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance); // Call Account constructor
        this.transactionFee = transactionFee;
    }

    // Override withdraw() to include transaction fee
    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + transactionFee;
        if (totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrawn: " + amount + " (Fee: " + transactionFee + ")");
        } else {
            System.out.println("Insufficient funds for withdrawal and fee.");
        }
    }
}
