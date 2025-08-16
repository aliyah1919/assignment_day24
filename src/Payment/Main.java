package Payment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Payable cc = new CreditCard("1234123412341234", "Aliyah Nafilah");
        Payable pp = new PayPal("aliyah19@gmail.com");
        Payable bt = new BankTransfer("Bank Syariah", "1111222233", "TX12345");

        ArrayList<Payable> payments = new ArrayList<>();
        payments.add(cc);
        payments.add(pp);
        payments.add(bt);

        for (Payable payment : payments) {
            System.out.println(payment.getPaymentDetails());
            payment.pay(100.0 + Math.random() * 500);
            System.out.println("------------------------------------------------");
        }
    }
}
