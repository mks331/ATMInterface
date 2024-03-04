public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM(userAccount);

        atm.start();

        // Close the scanner when done to prevent resource leaks
        atm.close();
    }
}
