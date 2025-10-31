
interface PaymentMethod {
    void process(double amount);
}
class CreditCardPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class PaymentProcessor {
    private final PaymentMethod paymentMethod;
    private final EmailService emailService;

    public PaymentProcessor(PaymentMethod paymentMethod, EmailService emailService) {
        this.paymentMethod = paymentMethod;
        this.emailService = emailService;
    }

    public void processPayment(double amount, String customerEmail) {
        paymentMethod.process(amount);
        emailService.sendEmail(customerEmail, "Payment of $" + amount + " processed successfully");
    }
}

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();

        // Exemplo com cartão de crédito
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor processor1 = new PaymentProcessor(creditCard, emailService);
        processor1.processPayment(100.0, "customer@example.com");

        // Exemplo com PayPal
        PaymentMethod paypal = new PayPalPayment();
        PaymentProcessor processor2 = new PaymentProcessor(paypal, emailService);
        processor2.processPayment(200.0, "another@example.com");
    }
}
