public class Main {
    public static void main(String[] args) {
        // Create and use a SavingsAccount
        SavingsAccount savings = new SavingsAccount(101, 1000.0, 5.0);
        savings.deposit(200);
        savings.addInterest();
        savings.displayBalance();

        System.out.println();

        // Create and use a CheckingAccount
        CheckingAccount checking = new CheckingAccount(202, 500.0, 10.0);
        checking.deposit(100);
        checking.withdraw(50);
        checking.displayBalance();
    }
}
