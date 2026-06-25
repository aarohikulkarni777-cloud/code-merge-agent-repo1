import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class PaymentProcessor {

    private static final Logger logger = Logger.getLogger(PaymentProcessor.class.getName());

    public boolean processPayment(double amount) {
        System.out.println("Processing payment of " + amount);
        return true;
    }

    public void auditLog(String action) {
        logger.info("Audit: " + action);
    }
}
