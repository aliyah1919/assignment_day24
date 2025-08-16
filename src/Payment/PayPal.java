package Payment;

public class PayPal implements Payable {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal account: " + email;
    }
}

