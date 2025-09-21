/*Problem 7: Interface with Multiple Implementations - Create an interface Payment with a
method pay(). Implement this interface in two classes CreditCardPayment and
PaypalPayment. Write a PaymentProcessor class that uses the Payment interface to
process payments.*/
interface PaymentInterface {

    void pay();
}

class CreditCardPayment implements PaymentInterface {

    @Override
    public void pay() {
        System.out.println("Payment is done through Credit Card");

    }
}

class PaypalPayment implements PaymentInterface {

    @Override
    public void pay() {
        System.out.println("Payment is Done through Paypal");
    }
}

class PaymentProcessor {

    PaymentInterface payment;

    public PaymentProcessor(PaymentInterface payment) {
        this.payment = payment;
    }

    public void processPayment() {
        payment.pay();
    }
}

public class Main7 {

    public static void main(String[] args) {

        PaymentInterface cc = new CreditCardPayment();
        PaymentProcessor p1 = new PaymentProcessor(cc);
        System.out.println("Payment processor got an input to use Credit Card");
        p1.processPayment();

        System.out.println("---------------------------------------");

        PaymentInterface pp = new PaypalPayment();
        PaymentProcessor p2 = new PaymentProcessor(pp);
        System.out.println("Payment processor got an input to use Paypal");
        p2.processPayment();

    }
}
