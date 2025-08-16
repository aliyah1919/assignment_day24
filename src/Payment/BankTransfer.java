package Payment;

public class BankTransfer extends OnlinePayment {
    private String bankName;
    private String accountNumber;

    public BankTransfer(String bankName, String accountNumber, String transactionId) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        setTransactionId(transactionId);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Transferred $" + amount + " via Bank Transfer (" + bankName + ").");
    }

    @Override
    public String getPaymentDetails() {
        return "Bank Transfer to Account: " + accountNumber + " at " + bankName +
                " [Transaction ID: " + getTransactionId() + "]";
    }
}
