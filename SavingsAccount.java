class SavingsAccount {
    // Static variable for annual interest rate
    private static double annualInterestRate;

    // Instance variable for savings balance
    private double savingsBalance;

    // Constructor to initialize savings balance
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Method to get the current balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}

public class SavingsAccountTest {
    public static void main(String[] args) {
        // Create two SavingsAccount objects with initial balances
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set the annual interest rate to 4% and calculate monthly interest
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Display new balances for both savers
        System.out.println("Balances after 4% interest:");
        System.out.printf("Saver1: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2: Rs %.2f%n", saver2.getSavingsBalance());

        // Set the annual interest rate to 5% and calculate monthly interest
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Display new balances for both savers
        System.out.println("Balances after 5% interest:");
        System.out.printf("Saver1: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2: Rs %.2f%n", saver2.getSavingsBalance());
    }
}