public class Account implements IAccount{
    private final int accountNumber;
    private final String accountHolderName;
    private double balance;
    Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
    public void withdraw(double withdrawAmount){
        try {
            if (withdrawAmount > balance) {
                throw new BalanceBelowZeroException("You're broke 😢");
            }
            else {
                balance -= withdrawAmount;
            }
        } catch (BalanceBelowZeroException bbze) {
            System.out.println(bbze);
        }
    }
}
